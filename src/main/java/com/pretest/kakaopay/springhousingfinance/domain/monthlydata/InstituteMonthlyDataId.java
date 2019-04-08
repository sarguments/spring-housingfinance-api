package com.pretest.kakaopay.springhousingfinance.domain.monthlydata;

import java.io.Serializable;
import java.util.Objects;

public class InstituteMonthlyDataId implements Serializable {
    private int year;
    private String instituteCode;
    private int month;

    public InstituteMonthlyDataId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstituteMonthlyDataId that = (InstituteMonthlyDataId) o;
        return year == that.year &&
                month == that.month &&
                Objects.equals(instituteCode, that.instituteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, instituteCode, month);
    }
}
