package com.pretest.kakaopay.springhousingfinance.domain.yearlysupply;

import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupply;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyDto;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Entity
public class YearlySupply {
    @Id
    private int year;

    @OneToMany
    private Set<YearlyInstituteSupply> instituteYearlySupplies;

    public YearlySupply() {
    }

    public YearlySupply(int year) {
        this.year = year;
    }

    public YearlySupply(int year, Set<YearlyInstituteSupply> instituteYearlySupplies) {
        this.year = year;
        this.instituteYearlySupplies = instituteYearlySupplies;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return "YearlySupply{" +
                ", yearlysupply=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        YearlySupply year1 = (YearlySupply) o;
        return this.year == year1.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }

    public YearlySupplyDto toDto() {
        return new YearlySupplyDto(this.year, calcTotalAmount(), calcDetailAmount());
    }

    public Map<String, Integer> calcDetailAmount() {
        Map<String, Integer> detailAmount = new HashMap<>();
        for (YearlyInstituteSupply iys : instituteYearlySupplies) {
            detailAmount.put(iys.findInstituteName(), iys.calcTotalAmount());
        }
        return null;
    }

    public int calcTotalAmount() {
        return 0;
    }
}
