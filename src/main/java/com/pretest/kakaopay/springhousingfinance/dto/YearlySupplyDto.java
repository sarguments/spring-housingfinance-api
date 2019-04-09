package com.pretest.kakaopay.springhousingfinance.dto;

import java.util.Map;

public class YearlySupplyDto {
    private int year;
    private int totalAmount;
    private Map<String, Integer> detailAmount;

    public YearlySupplyDto() {
    }

    public YearlySupplyDto(int year, Map<String, Integer> detailAmount, int totalAmount) {
        this.year = year;
        this.totalAmount = totalAmount;
        this.detailAmount = detailAmount;
    }

    public int getYear() {
        return year;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public Map<String, Integer> getDetailAmount() {
        return detailAmount;
    }

    @Override
    public String toString() {
        return "YearlySupplyDto{" +
                "year=" + year +
                ", totalAmount=" + totalAmount +
                ", detailAmount=" + detailAmount +
                '}';
    }
}
