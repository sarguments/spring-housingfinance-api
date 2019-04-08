package com.pretest.kakaopay.support.util.dto;

import com.pretest.kakaopay.springhousingfinance.domain.monthlydata.InstituteMonthlyData;
import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
import com.pretest.kakaopay.support.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class EntityGeneratorTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(EntityGeneratorTest.class);

    @Test
    public void generateMonthlyDatas() {
        CsvDataDto dataDto = CSV_DATA_DTO_FIXTURE;
        List<InstituteMonthlyData> dataList = EntityGenerator.generateMonthlyDatas(dataDto);

        for (InstituteMonthlyData instituteMonthlyData : dataList) {
            logger.debug("data : {}", instituteMonthlyData);
        }
    }
}