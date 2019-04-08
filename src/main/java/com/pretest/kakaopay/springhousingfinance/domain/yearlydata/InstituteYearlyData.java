package com.pretest.kakaopay.springhousingfinance.domain.yearlydata;

import com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute.SupplyInstitute;
import com.pretest.kakaopay.springhousingfinance.domain.yeardata.YearData;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(InstituteYearlyDataId.class)
public class InstituteYearlyData {
    @Id
    private int year;

    @Id
    private String instituteCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
    @JoinColumns(value = {
            @JoinColumn(name = "year", updatable = false, insertable = false)
    }, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private YearData yearData;

    @ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
    @JoinColumns(value = {
            @JoinColumn(name = "instituteCode", updatable = false, insertable = false)
    }, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private SupplyInstitute supplyInstitute;

//    @OneToMany(mappedBy = "instituteYearlyData")
//    private List<InstituteMonthlyData> instituteMonthlyDatas;

    public InstituteYearlyData() {
    }

    public InstituteYearlyData(int year, String instituteCode) {
        this.year = year;
        this.instituteCode = instituteCode;
    }


    @Override
    public String toString() {
        return "InstituteYearlyData{" +
                "year=" + year +
                ", instituteCode='" + instituteCode + '\'' +
                ", yearData=" + yearData +
                ", supplyInstitute=" + supplyInstitute +
                '}';
    }

    public YearData getYearData() {
        return yearData;
    }

    public SupplyInstitute getSupplyInstitute() {
        return supplyInstitute;
    }

    public void setYearData(YearData yearData) {
        this.yearData = yearData;
    }

    public void setSupplyInstitute(SupplyInstitute supplyInstitute) {
        this.supplyInstitute = supplyInstitute;
    }

    @Override
    public boolean equals(Object o) {
        InstituteYearlyData that = (InstituteYearlyData) o;
        return this.instituteCode.equals(that.instituteCode) &&
                this.year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, instituteCode);
    }


}
