package com.pretest.kakaopay.springhousingfinance.config;

import com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply.InstituteMonthlySupply;
import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
import com.pretest.kakaopay.springhousingfinance.job.CsvDataProcessor;
import com.pretest.kakaopay.springhousingfinance.job.CsvDataReaderBuilder;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;

import static com.pretest.kakaopay.support.job.LineGenerator.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Configuration
public class BatchJobConfig {
    private static final Logger logger = LoggerFactory.getLogger(BatchJobConfig.class);

    private static final int CHUNK_SIZE = 1;
    private static final int SKIP_LINE = 1;

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Value("${csv.data}")
    private ClassPathResource csvResource;

    @Bean
    public Job saveSupplyStatusDataJob() {
        return jobBuilderFactory.get("saveSupplyStatusDataJob")
                .start(saveSupplyStatusDataStep())
                .build();
    }

    @Bean
    @JobScope // job 실행시점에 bean으로 등록, job 실행후 삭제
    public Step saveSupplyStatusDataStep() {
        return stepBuilderFactory.get("saveSupplyStatusDataStep")
                .<CsvDataDto, List<InstituteMonthlySupply>>chunk(CHUNK_SIZE)
                .reader(csvSupplyStatusDataReader())
                .processor(csvSupplyStatusDataProcessor())
                .writer(MonthlySupplyStatusJpaWriter())
                .build();
    }

    @Bean
    @StepScope
    public FlatFileItemReader<? extends CsvDataDto> csvSupplyStatusDataReader() {
        return CsvDataReaderBuilder.init()
                .resource(csvResource)
                .lineToSkip(SKIP_LINE)
                .names(generateLine(new String[]{"year", "month"}, InstituteCode.getCodes()))
                .build();
    }

    @Bean
    @StepScope
    public ItemProcessor<? super CsvDataDto, ? extends List<InstituteMonthlySupply>> csvSupplyStatusDataProcessor() {
        return new CsvDataProcessor();
    }

    @Bean
    @StepScope
    public ItemWriter<? super List<InstituteMonthlySupply>> MonthlySupplyStatusJpaWriter() {
        return items -> items.stream().forEach(item -> save(item));
    }

    private <T> void save(List<T> entities) {
        for (T t : entities) {
            entityManager.merge(t);
        }
        entityManager.flush();
    }

}
