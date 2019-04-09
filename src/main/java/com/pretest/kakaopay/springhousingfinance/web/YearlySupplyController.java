package com.pretest.kakaopay.springhousingfinance.web;

import com.pretest.kakaopay.springhousingfinance.dto.YearlySuppliesDto;
import com.pretest.kakaopay.springhousingfinance.service.YearlySupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yearlySupplies")
public class YearlySupplyController {

    @Autowired
    private YearlySupplyService yearlySupplyService;

    @GetMapping
    public YearlySuppliesDto yearlySupplies() {
        return yearlySupplyService.yearlySupplies();
    }


}
