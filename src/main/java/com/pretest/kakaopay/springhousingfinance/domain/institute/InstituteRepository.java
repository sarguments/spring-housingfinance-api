package com.pretest.kakaopay.springhousingfinance.domain.institute;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface InstituteRepository extends JpaRepository<Institute, String> {
    @EntityGraph(attributePaths = {"yearlyInstituteSupplies", "yearlyInstituteSupplies.instituteMonthlySupplies"})
    @Query("select i from Institute i where i.instituteCode = ?1")
    Optional<Institute> findByIdWithYearlySupply(String instituteCode);
}
