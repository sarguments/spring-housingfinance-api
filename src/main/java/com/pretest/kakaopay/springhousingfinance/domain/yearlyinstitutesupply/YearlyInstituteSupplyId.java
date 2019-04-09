package com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply;

import java.io.Serializable;
import java.util.Objects;

public class YearlyInstituteSupplyId implements Serializable {
    private int year;
    private String instituteCode;

    public YearlyInstituteSupplyId() {
    }

    public YearlyInstituteSupplyId(int year, String instituteCode) {
        this.year = year;
        this.instituteCode = instituteCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearlyInstituteSupplyId that = (YearlyInstituteSupplyId) o;
        return year == that.year &&
                Objects.equals(instituteCode, that.instituteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, instituteCode);
    }
}
