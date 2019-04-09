package com.pretest.kakaopay.springhousingfinance.domain.yearlysupply;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface YearlySupplyRepository extends JpaRepository<YearlySupply, Integer> {
//    @Query("select y from YearlySupply y join fetch y.yearlyInstituteSupplies i join fetch i.instituteMonthlySupplies")
    @EntityGraph(attributePaths = {"yearlyInstituteSupplies", "yearlyInstituteSupplies.instituteMonthlySupplies"})
    @Query("select distinct y from YearlySupply y")
    List<YearlySupply> findAllWithMonthlySupplies();
}
