package com.pretest.kakaopay.springhousingfinance.job;

import com.pretest.kakaopay.springhousingfinance.domain.monthlydata.InstituteMonthlyData;
import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
import com.pretest.kakaopay.support.util.dto.EntityGenerator;
import org.springframework.batch.item.ItemProcessor;

import java.util.List;

public class CsvDataProcessor implements ItemProcessor<CsvDataDto, List<InstituteMonthlyData>> {
    @Override
    public List<InstituteMonthlyData> process(CsvDataDto item) throws Exception {
        return EntityGenerator.generateMonthlyDatas(item);
    }
}
