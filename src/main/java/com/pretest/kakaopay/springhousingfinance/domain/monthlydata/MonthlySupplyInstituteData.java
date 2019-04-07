package com.pretest.kakaopay.springhousingfinance.domain.monthlydata;

import com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute.SupplyInstitute;

import javax.persistence.*;

@Entity
public class MonthlySupplyInstituteData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int year;

    @Column
    private int month;

    @ManyToOne
    @JoinColumn(name = "institute_code")
    private SupplyInstitute supplyInstitute;

    @Column
    private int monthlyData;

    public MonthlySupplyInstituteData() {
    }

    public MonthlySupplyInstituteData(int year, int month, SupplyInstitute supplyInstitute, int monthlyData) {
        this.year = year;
        this.month = month;
        this.supplyInstitute = supplyInstitute;
        this.monthlyData = monthlyData;
    }

    @Override
    public String toString() {
        return "MonthlySupplyInstituteData{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", supplyInstitute=" + supplyInstitute +
                ", monthlyData=" + monthlyData +
                '}';
    }
}
