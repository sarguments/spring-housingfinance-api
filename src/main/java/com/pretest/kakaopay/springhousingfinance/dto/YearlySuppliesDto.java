package com.pretest.kakaopay.springhousingfinance.dto;

import java.util.List;

public class YearlySuppliesDto {
    private String name;
    private List<YearlySupplyDto> data;

    public YearlySuppliesDto() {
    }

    public YearlySuppliesDto(String name, List<YearlySupplyDto> data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return this.name;
    }

    public List<YearlySupplyDto> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "YearlySuppliesDto{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
