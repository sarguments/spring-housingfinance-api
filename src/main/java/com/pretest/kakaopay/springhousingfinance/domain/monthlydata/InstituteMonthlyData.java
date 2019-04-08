package com.pretest.kakaopay.springhousingfinance.domain.monthlydata;

import com.pretest.kakaopay.springhousingfinance.domain.yearlydata.InstituteYearlyData;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(InstituteMonthlyDataId.class)
public class InstituteMonthlyData {
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
    private InstituteYearlyData instituteYearlyData;

    public InstituteMonthlyData() {
    }

    public InstituteMonthlyData(int year, String instituteCode, int month, int monthlyData) {
        this.year = year;
        this.instituteCode = instituteCode;
        this.month = month;
        this.monthlyData = monthlyData;
    }

    public InstituteYearlyData getInstituteYearlyData() {
        return instituteYearlyData;
    }

    public void setInstituteYearlyData(InstituteYearlyData instituteYearlyData) {
        this.instituteYearlyData = instituteYearlyData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstituteMonthlyData that = (InstituteMonthlyData) o;
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
        return "InstituteMonthlyData{" +
                "year=" + year +
                ", instituteCode='" + instituteCode + '\'' +
                ", month=" + month +
                ", monthlyData=" + monthlyData +
                ", instituteYearlyData=" + instituteYearlyData +
                '}';
    }
}
