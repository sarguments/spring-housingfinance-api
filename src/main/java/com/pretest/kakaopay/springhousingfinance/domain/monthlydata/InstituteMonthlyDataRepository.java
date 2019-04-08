package com.pretest.kakaopay.springhousingfinance.domain.monthlydata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InstituteMonthlyDataRepository extends JpaRepository<InstituteMonthlyData, InstituteMonthlyDataId> {
//    @Query("select d from InstituteMonthlyData d join fetch d.supplyInstitute where d.yeardata = ?1")
//    List<InstituteMonthlyData> findByYear(int yeardata);
}
