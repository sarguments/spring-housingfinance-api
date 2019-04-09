package com.pretest.kakaopay.support.util.job;

import com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply.InstituteMonthlySupply;
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
        List<InstituteMonthlySupply> dataList = EntityGenerator.generateMonthlyDatas(dataDto);

        for (InstituteMonthlySupply instituteMonthlySupply : dataList) {
            logger.debug("data : {}", instituteMonthlySupply);
        }
    }
}