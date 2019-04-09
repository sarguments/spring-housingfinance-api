package com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituteMonthlySupplyRepository extends JpaRepository<InstituteMonthlySupply, InstituteMonthlySupplyId> {
//    @Query("select d from InstituteMonthlySupply d join fetch d.supplyInstitute where d.yearlysupply = ?1")
//    List<InstituteMonthlySupply> findByYear(int yearlysupply);
}
