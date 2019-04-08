package com.pretest.kakaopay.springhousingfinance.vo;

import com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute.SupplyInstitute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum InstituteCode {
    HOUSING_CITY_FUND("hcf","주택도시기금"),
    KB_BANK("bnk006","국민은행"),
    WR_BANK("bnk020","우리은행"),
    SH_BANK("bnk021", "신한은행"),
    CT_BANK("bnk027","한국씨티은행"),
    HN_BANK("bnk081","하나은행"),
    NH_BANK("bnk095","농협은행/수협은행"),
    KE_BANK("bnk005","외환은행"),
    ETC_BANK("bnk999","기타은행");

    private String instituteCode;
    private String instituteName;

    InstituteCode(String instituteCode, String instituteName) {
        this.instituteCode = instituteCode;
        this.instituteName = instituteName;
    }

    public String getInstituteCode() {
        return instituteCode;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public static List<String> getCodes() {
        return Arrays.stream(InstituteCode.values()).map(i -> i.instituteCode).collect(Collectors.toList());
    }

    public SupplyInstitute convertEntity() {
        return new SupplyInstitute(this.instituteCode, this.instituteName);
    }

    public static List<SupplyInstitute> convertEntities() {
        List<SupplyInstitute> entities = new ArrayList<>();
        for (InstituteCode value : values()) {
            entities.add(value.convertEntity());
        }
        return entities;
    }
}
