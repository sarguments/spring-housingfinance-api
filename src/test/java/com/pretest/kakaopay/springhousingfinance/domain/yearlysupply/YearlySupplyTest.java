package com.pretest.kakaopay.springhousingfinance.domain.yearlysupply;

import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyDto;
import com.pretest.kakaopay.support.test.BaseTest;
import org.junit.Test;

import java.util.Map;

public class YearlySupplyTest extends BaseTest {

    @Test
    public void toDto() {
        YearlySupply yearlySupply = YEARLY_SUPPLY_FIXTURE;
        YearlySupplyDto dto = yearlySupply.toDto();
        softly.assertThat(dto.getYear()).isEqualTo(2017);
        softly.assertThat(dto.getTotalAmount()).isEqualTo(295126);
    }

    @Test
    public void calcTotalAmount() {
        YearlySupply yearlySupply = YEARLY_SUPPLY_FIXTURE;
        yearlySupply.calcDetailAmount();

        int totalAmount = yearlySupply.calcTotalAmount();
        softly.assertThat(totalAmount).isEqualTo(295126);
    }

    @Test
    public void calcDetailAmount() {
        YearlySupply yearlySupply = YEARLY_SUPPLY_FIXTURE;
        Map<String, Integer> detailAmount = yearlySupply.calcDetailAmount();

        softly.assertThat(detailAmount.get("주택도시기금")).isEqualTo(85409);
        softly.assertThat(detailAmount.get("국민은행")).isEqualTo(31480);
        softly.assertThat(detailAmount.get("우리은행")).isEqualTo(38846);
        softly.assertThat(detailAmount.get("신한은행")).isEqualTo(40729);
        softly.assertThat(detailAmount.get("한국씨티은행")).isEqualTo(7);
        softly.assertThat(detailAmount.get("하나은행")).isEqualTo(35629);
        softly.assertThat(detailAmount.get("농협은행/수협은행")).isEqualTo(26969);
        softly.assertThat(detailAmount.get("외환은행")).isEqualTo(0);
        softly.assertThat(detailAmount.get("기타은행")).isEqualTo(36057);
    }
}