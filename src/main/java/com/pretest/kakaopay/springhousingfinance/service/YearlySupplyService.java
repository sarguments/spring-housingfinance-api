package com.pretest.kakaopay.springhousingfinance.service;

import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupplyRepository;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySuppliesDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YearlySupplyService {
    private static final Logger logger = LoggerFactory.getLogger(YearlySupplyService.class);

    private static final String YEARLY_SUPPLIES = "주택금융 공급현황";

    @Autowired
    private YearlySupplyRepository yearlySupplyRepository;

    public YearlySuppliesDto yearlySupplies() {
        return new YearlySuppliesDto(YEARLY_SUPPLIES, yearlySupplyRepository.findAllWithInstitutes());
    }
}
