package com.pretest.kakaopay.springhousingfinance.dto;

import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupply;

import java.util.List;
import java.util.stream.Collectors;

public class YearlySuppliesDto {
    private String name;
    private List<YearlySupplyDto> data;

    public YearlySuppliesDto() {
    }

    public YearlySuppliesDto(String name, List<YearlySupply> rowData) {
        this.name = name;
        this.data = convertDto(rowData);
    }

    private List<YearlySupplyDto> convertDto(List<YearlySupply> rowData) {
        return rowData.stream().map(y -> y.toDto()).collect(Collectors.toList());
    }

    public String getName() {
        return this.name;
    }

    public List<YearlySupplyDto> getData() {
        return data;
    }
}
