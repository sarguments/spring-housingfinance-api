package com.pretest.kakaopay.springhousingfinance.dto;

public class YearlySupplyAvgDto implements Comparable<YearlySupplyAvgDto> {
    private int year;
    private int amount;

    public YearlySupplyAvgDto() {
    }

    public YearlySupplyAvgDto(int year, int amount) {
        this.year = year;
        this.amount = amount;
    }

    public int getYear() {
        return year;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "YearlySupplyAvgDto{" +
                "year=" + year +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(YearlySupplyAvgDto o) {
        if (this.amount < o.amount)
            return -1;
        if (this.amount > o.amount)
            return 1;
        return 0;
    }
}
