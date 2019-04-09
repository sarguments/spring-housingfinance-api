package com.pretest.kakaopay.springhousingfinance.domain.institute;

import com.pretest.kakaopay.springhousingfinance.dto.InstituteDto;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Institute {
    @Id
    private String instituteCode;

    @Column
    private String instituteName;

    public Institute() {
    }

    public Institute(String instituteCode, String instituteName) {
        this.instituteCode = instituteCode;
        this.instituteName = instituteName;
    }

    public String getInstituteCode() {
        return instituteCode;
    }

    public String getInstituteName() {
        return instituteName;
    }

    @Override
    public boolean equals(Object o) {
        Institute that = (Institute) o;
        return this.instituteCode.equals(that.instituteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instituteCode, instituteName);
    }

    @Override
    public String toString() {
        return "Institute{" +
                "instituteCode='" + instituteCode + '\'' +
                ", instituteName='" + instituteName + '\'' +
                '}';
    }

    public InstituteDto toDto() {
        return new InstituteDto(this.instituteName, this.instituteCode);
    }
}
