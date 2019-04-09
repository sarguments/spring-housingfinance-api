package com.pretest.kakaopay.springhousingfinance.dto;

public class CsvDataDto {
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

    public void set(String s) { }

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

    public CsvDataDto() {
    }

    public CsvDataDto(Integer year, Integer month, Integer hcf, Integer bnk006, Integer bnk020, Integer bnk021, Integer bnk027, Integer bnk081, Integer bnk095, Integer bnk005, Integer bnk999) {
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

    @Override
    public String toString() {
        return "CsvDataDto{" +
                "yearlysupply=" + year +
                ", yearlyinstitutesupply=" + month +
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
