package com.pretest.kakaopay.springhousingfinance.job;

import com.pretest.kakaopay.springhousingfinance.domain.institute.Institute;
import com.pretest.kakaopay.springhousingfinance.domain.institute.InstituteRepository;
import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupply;
import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupplyId;
import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupplyRepository;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;
import com.pretest.kakaopay.support.test.AcceptanceTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class JobTest extends AcceptanceTest {
    private static final Logger logger = LoggerFactory.getLogger(JobTest.class);

    @Autowired
    private InstituteRepository instituteRepository;

    @Autowired
    private YearlyInstituteSupplyRepository yearlyInstituteSupplyRepository;

    @Test
    public void supplyInstitutesTest() {
        InstituteCode instituteCode = InstituteCode.CT_BANK;
        Institute institute = instituteRepository.findById(instituteCode.getInstituteCode()).get();

        logger.debug("institute : {}", institute);
        softly.assertThat(institute.equals(instituteCode.convertEntity())).isTrue();
    }

    @Test
    public void instituteYearlyDataTest() {
        int year = 2017;
        String instituteCode = InstituteCode.WR_BANK.getInstituteCode();
        YearlyInstituteSupply data = yearlyInstituteSupplyRepository.findById(new YearlyInstituteSupplyId(year, instituteCode)).get();

        logger.debug("data : {}", data);
    }
}
