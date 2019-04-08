package com.pretest.kakaopay.springhousingfinance.domain.yeardata;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class YearData {

    @Id
    private int year;


//    @OneToMany(mappedBy = "yeardata")
//    private List<InstituteYearlyData> instituteYearlyDatas;

    public YearData() {
    }

    public YearData(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return "YearData{" +
                ", yeardata=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        YearData year1 = (YearData) o;
        return this.year == year1.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }
}
