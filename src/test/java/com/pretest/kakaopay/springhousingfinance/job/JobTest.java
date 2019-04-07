package com.pretest.kakaopay.springhousingfinance.job;

import com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute.SupplyInstitute;
import com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute.SupplyInstituteRepository;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;
import com.pretest.kakaopay.support.test.AcceptanceTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class JobTest extends AcceptanceTest {
    private static final Logger logger = LoggerFactory.getLogger(JobTest.class);

    @Autowired
    private SupplyInstituteRepository supplyInstituteRepository;

    @Test
    public void supplyInstitutesTest() {
        InstituteCode instituteCode = InstituteCode.CT_BANK;
        SupplyInstitute supplyInstitute = supplyInstituteRepository.findById(instituteCode.getInstituteCode()).get();

        logger.debug("institute : {}", supplyInstitute);
        softly.assertThat(supplyInstitute.equals(new SupplyInstitute(instituteCode.getInstituteCode(), instituteCode.getInstituteName()))).isTrue();
    }

    @Test
    public void monthlySupplyInstituteDataTest() {
    }
}
