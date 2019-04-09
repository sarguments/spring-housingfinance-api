package com.pretest.kakaopay.springhousingfinance.domain.yearlysupply;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface YearlySupplyRepository extends JpaRepository<YearlySupply, Integer> {
    @EntityGraph(attributePaths = {"yearlyInstituteSupplies", "yearlyInstituteSupplies.instituteMonthlySupplies"})
    @Query("select distinct y from YearlySupply y")
    List<YearlySupply> findAllWithMonthlySupplies();
}
