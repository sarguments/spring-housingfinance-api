package com.pretest.kakaopay.springhousingfinance.dto;

public class YearMaxSupplyInstituteDto {
    private int year;
    private String bank;

    public YearMaxSupplyInstituteDto() {
    }

    public YearMaxSupplyInstituteDto(int year, String bank) {
        this.year = year;
        this.bank = bank;
    }

    public int getYear() {
        return year;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "YearMaxSupplyInstituteDto{" +
                "year=" + year +
                ", bank='" + bank + '\'' +
                '}';
    }
}
