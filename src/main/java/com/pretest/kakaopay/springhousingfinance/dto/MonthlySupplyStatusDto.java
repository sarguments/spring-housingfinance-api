package com.pretest.kakaopay.springhousingfinance.dto;

import com.pretest.kakaopay.springhousingfinance.domain.monthlydata.MonthlySupplyInstituteData;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;

import static com.pretest.kakaopay.springhousingfinance.vo.InstituteCode.*;

import java.util.ArrayList;
import java.util.List;

public class MonthlySupplyStatusDto {
    private Integer year;
    private Integer month;
    private Integer hcf;
    private Integer bnk006;
    private Integer bnk020;
    private Integer bnk021;
    private Integer bnk027;
    private Integer bnk081;
    private Integer bnk095;
    private Integer bnk005;
    private Integer bnk999;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getHcf() {
        return hcf;
    }

    public void setHcf(Integer hcf) {
        this.hcf = hcf;
    }

    public Integer getBnk006() {
        return bnk006;
    }

    public void setBnk006(Integer bnk006) {
        this.bnk006 = bnk006;
    }

    public Integer getBnk020() {
        return bnk020;
    }

    public void setBnk020(Integer bnk020) {
        this.bnk020 = bnk020;
    }

    public Integer getBnk021() {
        return bnk021;
    }

    public void setBnk021(Integer bnk021) {
        this.bnk021 = bnk021;
    }

    public Integer getBnk027() {
        return bnk027;
    }

    public void setBnk027(Integer bnk027) {
        this.bnk027 = bnk027;
    }

    public Integer getBnk081() {
        return bnk081;
    }

    public void setBnk081(Integer bnk081) {
        this.bnk081 = bnk081;
    }

    public Integer getBnk095() {
        return bnk095;
    }

    public void setBnk095(Integer bnk095) {
        this.bnk095 = bnk095;
    }

    public Integer getBnk005() {
        return bnk005;
    }

    public void setBnk005(Integer bnk005) {
        this.bnk005 = bnk005;
    }

    public Integer getBnk999() {
        return bnk999;
    }

    public void setBnk999(Integer bnk999) {
        this.bnk999 = bnk999;
    }

    public MonthlySupplyStatusDto() {
    }

    public MonthlySupplyStatusDto(Integer year, Integer month, Integer hcf, Integer bnk006, Integer bnk020, Integer bnk021, Integer bnk027, Integer bnk081, Integer bnk095, Integer bnk005, Integer bnk999) {
        this.year = year;
        this.month = month;
        this.hcf = hcf;
        this.bnk006 = bnk006;
        this.bnk020 = bnk020;
        this.bnk021 = bnk021;
        this.bnk027 = bnk027;
        this.bnk081 = bnk081;
        this.bnk095 = bnk095;
        this.bnk005 = bnk005;
        this.bnk999 = bnk999;
    }

    public List<MonthlySupplyInstituteData> convertEntities() {
        List<MonthlySupplyInstituteData> datas = new ArrayList<>();

        datas.add(generateData(HOUSING_CITY_FUND, this.hcf));
        datas.add(generateData(KB_BANK, this.bnk006));
        datas.add(generateData(WR_BANK, this.bnk020));
        datas.add(generateData(SH_BANK, this.bnk021));
        datas.add(generateData(CT_BANK, this.bnk027));
        datas.add(generateData(HN_BANK, this.bnk081));
        datas.add(generateData(NH_BANK, this.bnk095));
        datas.add(generateData(KE_BANK, this.bnk005));
        datas.add(generateData(ETC_BANK, this.bnk999));

        return datas;
    }

    private MonthlySupplyInstituteData generateData(InstituteCode instituteCode, int data) {
        return new MonthlySupplyInstituteData(this.year, this.month, convertEntity(instituteCode), data);
    }

    @Override
    public String toString() {
        return "MonthlySupplyStatusDto{" +
                "year=" + year +
                ", month=" + month +
                ", hcf=" + hcf +
                ", bnk006=" + bnk006 +
                ", bnk020=" + bnk020 +
                ", bnk021=" + bnk021 +
                ", bnk027=" + bnk027 +
                ", bnk081=" + bnk081 +
                ", bnk095=" + bnk095 +
                ", bnk005=" + bnk005 +
                ", bnk999=" + bnk999 +
                '}';
    }
}
