package com.pretest.kakaopay.springhousingfinance.domain.yearlydata;

import java.io.Serializable;
import java.util.Objects;

public class InstituteYearlyDataId implements Serializable {
    private int year;
    private String instituteCode;

    public InstituteYearlyDataId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstituteYearlyDataId that = (InstituteYearlyDataId) o;
        return year == that.year &&
                Objects.equals(instituteCode, that.instituteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, instituteCode);
    }
}
