package com.pretest.kakaopay.springhousingfinance.dto;

import com.pretest.kakaopay.springhousingfinance.domain.institute.Institute;

import java.util.List;
import java.util.stream.Collectors;

public class InstitutesDto {
    private String name;
    private List<InstituteDto> data;

    public InstitutesDto() {
    }

    public InstitutesDto(String name, List<Institute> rowData) {
        this.name = name;
        this.data = convertDto(rowData);
    }

    private List<InstituteDto> convertDto(List<Institute> rowData) {
        return rowData.stream().map(i -> i.toDto()).collect(Collectors.toList());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(List<InstituteDto> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public List<InstituteDto> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "InstitutesDto{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
