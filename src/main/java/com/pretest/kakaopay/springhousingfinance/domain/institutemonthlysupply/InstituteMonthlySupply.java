package com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply;

import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupply;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(InstituteMonthlySupplyId.class)
public class InstituteMonthlySupply {
    @Id
    private int year;

    @Id
    private String instituteCode;

    @Id
    private int month;

    @Column
    private int monthlyData;

    @ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
    @JoinColumns(value = {
            @JoinColumn(name = "year", updatable = false, insertable = false),
            @JoinColumn(name = "instituteCode", updatable = false, insertable = false)
    }, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private YearlyInstituteSupply yearlyInstituteSupply;

    public InstituteMonthlySupply() {
    }

    public InstituteMonthlySupply(int year, String instituteCode, int month, int monthlyData) {
        this.year = year;
        this.instituteCode = instituteCode;
        this.month = month;
        this.monthlyData = monthlyData;
    }

    public YearlyInstituteSupply getYearlyInstituteSupply() {
        return yearlyInstituteSupply;
    }

    public void setYearlyInstituteSupply(YearlyInstituteSupply yearlyInstituteSupply) {
        this.yearlyInstituteSupply = yearlyInstituteSupply;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstituteMonthlySupply that = (InstituteMonthlySupply) o;
        return year == that.year &&
                month == that.month &&
                monthlyData == that.monthlyData &&
                Objects.equals(instituteCode, that.instituteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, instituteCode, month, monthlyData);
    }

    @Override
    public String toString() {
        return "InstituteMonthlySupply{" +
                "year=" + year +
                ", instituteCode='" + instituteCode + '\'' +
                ", month=" + month +
                ", monthlyData=" + monthlyData +
                ", yearlyInstituteSupply=" + yearlyInstituteSupply +
                '}';
    }
}
