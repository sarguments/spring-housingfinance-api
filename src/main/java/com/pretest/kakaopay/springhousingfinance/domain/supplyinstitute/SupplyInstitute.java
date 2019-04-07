package com.pretest.kakaopay.springhousingfinance.domain.supplyinstitute;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class SupplyInstitute {
    @Id
    private String instituteCode;

    @Column
    private String instituteName;

    public SupplyInstitute() {
    }

    public SupplyInstitute(String instituteCode, String instituteName) {
        this.instituteCode = instituteCode;
        this.instituteName = instituteName;
    }

    @Override
    public boolean equals(Object o) {
        SupplyInstitute that = (SupplyInstitute) o;
        return Objects.equals(instituteCode, that.instituteCode) &&
                Objects.equals(instituteName, that.instituteName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instituteCode, instituteName);
    }

    @Override
    public String toString() {
        return "SupplyInstitute{" +
                "instituteCode='" + instituteCode + '\'' +
                ", instituteName='" + instituteName + '\'' +
                '}';
    }
}
