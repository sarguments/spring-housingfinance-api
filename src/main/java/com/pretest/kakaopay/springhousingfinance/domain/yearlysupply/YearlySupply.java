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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "yearlySupply")
    private Set<YearlyInstituteSupply> yearlyInstituteSupplies;

    @Transient
    private Map<String, Integer> detailAmount;

    public YearlySupply() {
    }

    public YearlySupply(int year) {
        this.year = year;
    }

    public YearlySupply(int year, Set<YearlyInstituteSupply> yearlyInstituteSupplies) {
        this.year = year;
        this.yearlyInstituteSupplies = yearlyInstituteSupplies;
    }

    public int getYear() {
        return this.year;
    }

    public Map<String, Integer> calcDetailAmount() {
        Map<String, Integer> detailAmount = new HashMap<>();
        for (YearlyInstituteSupply iys : yearlyInstituteSupplies) {
            detailAmount.put(iys.findInstituteName(), iys.calcTotalAmount());
        }
        return this.detailAmount = detailAmount;
    }

    public int calcTotalAmount() {
        int totalAmount = 0;
        for (String name : this.detailAmount.keySet()) {
            totalAmount += this.detailAmount.get(name);
        }
        return totalAmount;
    }

    public YearlySupplyDto toDto() {
        return new YearlySupplyDto(this.year, calcDetailAmount(), calcTotalAmount());
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

    @Override
    public String toString() {
        return "YearlySupply{" +
                "year=" + year +
                ", yearlyInstituteSupplies=" + yearlyInstituteSupplies +
                ", detailAmount=" + detailAmount +
                '}';
    }
}
