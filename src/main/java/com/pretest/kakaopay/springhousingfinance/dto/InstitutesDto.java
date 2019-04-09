package com.pretest.kakaopay.springhousingfinance.dto;

import java.util.List;

public class InstitutesDto {
    private String name;
    private List<InstituteDto> data;

    public InstitutesDto() {
    }

    public InstitutesDto(String name, List<InstituteDto> data) {
        this.name = name;
        this.data = data;
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
