package com.pretest.kakaopay.springhousingfinance.service;

import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupply;
import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupplyRepository;
import com.pretest.kakaopay.springhousingfinance.dto.YearMaxSupplyInstituteDto;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySuppliesDto;
import static com.pretest.kakaopay.support.util.ConverterUtil.*;

import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Service
public class YearlySupplyService {
    private static final Logger logger = LoggerFactory.getLogger(YearlySupplyService.class);

    private static final String YEARLY_SUPPLIES = "주택금융 공급현황";

    @Autowired
    private YearlySupplyRepository yearlySupplyRepository;

    private List<YearlySupply> findAllWithMonthlySupplies() {
        return yearlySupplyRepository.findAllWithMonthlySupplies();
    }

    public YearlySuppliesDto yearlySupplies() {
        return new YearlySuppliesDto(YEARLY_SUPPLIES, yearlySuppliesToDto(findAllWithMonthlySupplies()));
    }

    public YearMaxSupplyInstituteDto findYearMaxSupplyInstitute() {
        YearlySupplyDto max = findMaxYearSupplyDto(yearlySuppliesToDto(findAllWithMonthlySupplies()));
        return new YearMaxSupplyInstituteDto(max.getYear(), max.getMaximumSupplyBank());
    }

    private YearlySupplyDto findMaxYearSupplyDto(List<YearlySupplyDto> data) {
        Collections.sort(data);
        YearlySupplyDto yearlySupplyDto = data.get(0);

        return yearlySupplyDto;
    }
}
