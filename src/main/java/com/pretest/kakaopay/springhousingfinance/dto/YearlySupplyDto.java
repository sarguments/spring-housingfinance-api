package com.pretest.kakaopay.springhousingfinance.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class YearlySupplyDto implements Comparable<YearlySupplyDto> {
    private int year;
    private int totalAmount;
    private Map<String, Integer> detailAmount;
    private String maximumSupplyBank;
    private int maximumSupplyValue;

    public YearlySupplyDto() {
    }

    public YearlySupplyDto(int year, Map<String, Integer> detailAmount, int totalAmount, String bank, int maxValue) {
        this.year = year;
        this.totalAmount = totalAmount;
        this.detailAmount = detailAmount;
        this.maximumSupplyBank = bank;
        this.maximumSupplyValue = maxValue;
    }

    @JsonIgnore
    public String getMaximumSupplyBank() {
        return maximumSupplyBank;
    }

    @JsonIgnore
    public int getMaximumSupplyValue() {
        return maximumSupplyValue;
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

    @Override
    public int compareTo(YearlySupplyDto o) {
        if (this.maximumSupplyValue > o.maximumSupplyValue)
            return -1;
        if (this.maximumSupplyValue < o.maximumSupplyValue)
            return 1;
        return 0;
    }
}
