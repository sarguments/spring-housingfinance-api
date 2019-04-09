package com.pretest.kakaopay.springhousingfinance.web;

import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyAvgsDto;
import com.pretest.kakaopay.springhousingfinance.dto.InstitutesDto;
import com.pretest.kakaopay.springhousingfinance.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/institutes")
public class InstituteController {

    @Autowired
    private InstituteService instituteService;

    @GetMapping
    public InstitutesDto instititutes() {
        return instituteService.findAll();
    }

    @GetMapping("/{instituteCode}/avgs")
    public YearlySupplyAvgsDto instituteYearlyAvg(@PathVariable(name = "instituteCode") String instituteCode) {
        return instituteService.findByCodeWithYearlySupply(instituteCode);
    }


}
