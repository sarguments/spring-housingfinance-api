package com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply;

import com.pretest.kakaopay.support.test.BaseTest;
import org.junit.Test;

public class YearlyInstituteSupplyTest extends BaseTest {
    @Test
    public void findInstituteName() {
        YearlyInstituteSupply yis = YEARLY_INSTITUTE_SUPPLY_FIXTURE_1;
        String name = "주택도시기금";
        softly.assertThat(yis.findInstituteName()).isEqualTo(name);
    }

    @Test
    public void calcTotalAmount() {
        YearlyInstituteSupply yis = YEARLY_INSTITUTE_SUPPLY_FIXTURE_2;
        int totalAmount = 31480;
        softly.assertThat(yis.calcTotalAmount()).isEqualTo(totalAmount);
    }
}