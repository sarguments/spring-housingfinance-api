package com.pretest.kakaopay.springhousingfinance.dto;

import java.util.List;

public class YearlySupplyAvgsDto {
    private String bank;
    private List<YearlySupplyAvgDto> supportAmount;

    public YearlySupplyAvgsDto() {
    }

    public YearlySupplyAvgsDto(String bank, List<YearlySupplyAvgDto> supportAmount) {
        this.bank = bank;
        this.supportAmount = supportAmount;
    }

    public String getBank() {
        return bank;
    }

    public List<YearlySupplyAvgDto> getSupportAmount() {
        return supportAmount;
    }

    @Override
    public String toString() {
        return "YearlySupplyAvgsDto{" +
                "bank='" + bank + '\'' +
                ", supportAmount=" + supportAmount +
                '}';
    }
}
