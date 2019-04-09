package com.pretest.kakaopay.springhousingfinance.domain.institute;

import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyAvgsDto;
import com.pretest.kakaopay.support.test.BaseTest;
import org.junit.Test;

public class InstituteTest extends BaseTest {
    @Test
    public void toDto() {
        Institute institute = INSTITUTE_FIXTURE;
        softly.assertThat(institute.toDto().getName()).isEqualTo("외환은행");
    }

    @Test
    public void toYearlySupplyAvgsDto() {
        Institute institute = INSTITUTE_FIXTURE;
        YearlySupplyAvgsDto ysad = institute.toYearlySupplyAvgsDto();
        softly.assertThat(ysad.getBank()).isEqualTo("외환은행");
        softly.assertThat(ysad.getSupportAmount().size()).isEqualTo(0);
    }
}