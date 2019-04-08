package com.pretest.kakaopay.springhousingfinance.job;

import com.pretest.kakaopay.springhousingfinance.domain.monthlydata.InstituteMonthlyData;
import com.pretest.kakaopay.springhousingfinance.domain.monthlydata.InstituteMonthlyDataRepository;
import com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute.SupplyInstitute;
import com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute.SupplyInstituteRepository;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;
import com.pretest.kakaopay.support.test.AcceptanceTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobTest extends AcceptanceTest {
    private static final Logger logger = LoggerFactory.getLogger(JobTest.class);

    @Autowired
    private SupplyInstituteRepository supplyInstituteRepository;

    @Autowired
    private InstituteMonthlyDataRepository instituteMonthlyDataRepository;

    @Test
    public void supplyInstitutesTest() {
        InstituteCode instituteCode = InstituteCode.CT_BANK;
        SupplyInstitute supplyInstitute = supplyInstituteRepository.findById(instituteCode.getInstituteCode()).get();

        logger.debug("institute : {}", supplyInstitute);
        softly.assertThat(supplyInstitute.equals(instituteCode.convertEntity())).isTrue();
    }

    @Test
    public void monthlySupplyInstituteDataTest() {
//        int yeardata = 2017;
//        List<InstituteMonthlyData> datas = instituteMonthlyDataRepository.findByYear(yeardata);
//
//        for (InstituteMonthlyData data : datas) {
//            logger.debug("data : {}", data);
//        }
    }
}
