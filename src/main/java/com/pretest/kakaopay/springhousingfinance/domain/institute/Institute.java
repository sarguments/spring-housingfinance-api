package com.pretest.kakaopay.springhousingfinance.domain.institute;

import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupply;
import com.pretest.kakaopay.springhousingfinance.dto.InstituteDto;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyAvgsDto;
import static com.pretest.kakaopay.support.util.ConverterUtil.generateYearlyAvgsDto;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Institute {
    @Id
    private String instituteCode;

    @Column
    private String instituteName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "institute")
    private Set<YearlyInstituteSupply> yearlyInstituteSupplies;

    public Institute() {
    }

    public Institute(String instituteCode, String instituteName) {
        this.instituteCode = instituteCode;
        this.instituteName = instituteName;
    }

    public Institute(String instituteCode, String instituteName, Set<YearlyInstituteSupply> yearlyInstituteSupplies) {
        this.instituteCode = instituteCode;
        this.instituteName = instituteName;
        this.yearlyInstituteSupplies = yearlyInstituteSupplies;
    }

    public InstituteDto toDto() {
        return new InstituteDto(this.instituteName, this.instituteCode);
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

    public YearlySupplyAvgsDto toYearlySupplyAvgsDto() {
        return new YearlySupplyAvgsDto(
                this.instituteName,
                generateYearlyAvgsDto(this.yearlyInstituteSupplies)
        );
    }


    @Override
    public String toString() {
        return "Institute{" +
                "instituteCode='" + instituteCode + '\'' +
                ", instituteName='" + instituteName + '\'' +
                ", yearlyInstituteSupplies=" + yearlyInstituteSupplies +
                '}';
    }
}
