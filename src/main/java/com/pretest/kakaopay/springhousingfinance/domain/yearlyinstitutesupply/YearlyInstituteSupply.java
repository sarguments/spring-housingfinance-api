package com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply;

import com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply.InstituteMonthlySupply;
import com.pretest.kakaopay.springhousingfinance.domain.institute.Institute;
import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupply;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@IdClass(YearlyInstituteSupplyId.class)
public class YearlyInstituteSupply {
    @Id
    private int year;

    @Id
    private String instituteCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
    @JoinColumns(value = {
            @JoinColumn(name = "year", updatable = false, insertable = false)
    }, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private YearlySupply yearlySupply;

    @ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
    @JoinColumns(value = {
            @JoinColumn(name = "instituteCode", updatable = false, insertable = false)
    }, foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Institute institute;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "yearlyInstituteSupply")
    private Set<InstituteMonthlySupply> instituteMonthlySupplies;

    public YearlyInstituteSupply() {
    }

    public YearlyInstituteSupply(int year, String instituteCode) {
        this.year = year;
        this.instituteCode = instituteCode;
    }

    public YearlyInstituteSupply(int year, String instituteCode, Set<InstituteMonthlySupply> instituteMonthlySupplies) {
        this.year = year;
        this.instituteCode = instituteCode;
        this.instituteMonthlySupplies = instituteMonthlySupplies;
    }

    public YearlySupply getYearlySupply() {
        return yearlySupply;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setYearlySupply(YearlySupply yearlySupply) {
        this.yearlySupply = yearlySupply;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public String findInstituteName() {
        return InstituteCode.findName(this.instituteCode);
    }

    public int calcTotalAmount() {
        int total = 0;
        for (InstituteMonthlySupply instituteMonthlySupply : instituteMonthlySupplies)
            total += instituteMonthlySupply.getMonthlyData();

        return total;
    }

    @Override
    public boolean equals(Object o) {
        YearlyInstituteSupply that = (YearlyInstituteSupply) o;
        return this.instituteCode.equals(that.instituteCode) &&
                this.year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, instituteCode);
    }

    @Override
    public String toString() {
        return "YearlyInstituteSupply{" +
                "year=" + year +
                ", instituteCode='" + instituteCode + '\'' +
                ", yearlySupply=" + yearlySupply +
                ", institute=" + institute +
                '}';
    }
}
