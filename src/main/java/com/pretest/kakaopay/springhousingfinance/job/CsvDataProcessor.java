package com.pretest.kakaopay.springhousingfinance.job;

import com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply.InstituteMonthlySupply;
import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
import com.pretest.kakaopay.support.util.job.EntityGenerator;
import org.springframework.batch.item.ItemProcessor;

import java.util.List;

public class CsvDataProcessor implements ItemProcessor<CsvDataDto, List<InstituteMonthlySupply>> {
    @Override
    public List<InstituteMonthlySupply> process(CsvDataDto item) throws Exception {
        return EntityGenerator.generateMonthlyDatas(item);
    }
}
