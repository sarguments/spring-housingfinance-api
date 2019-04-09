package com.pretest.kakaopay.springhousingfinance.service;

import com.pretest.kakaopay.springhousingfinance.domain.institute.Institute;
import com.pretest.kakaopay.springhousingfinance.domain.institute.InstituteRepository;
import com.pretest.kakaopay.springhousingfinance.dto.InstitutesDto;

import static com.pretest.kakaopay.support.util.ConverterUtil.*;

import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyAvgsDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class InstituteService {
    private static final Logger logger = LoggerFactory.getLogger(InstituteService.class);

    private static final String INSTITUTES = "주택금융 공급업체";

    @Autowired
    private InstituteRepository instituteRepository;

    public InstitutesDto findAll() {
        return new InstitutesDto(INSTITUTES, institutesToDto(instituteRepository.findAll()));
    }

    public YearlySupplyAvgsDto findByCodeWithYearlySupply(String instituteCode) {
        return instituteRepository
                .findByIdWithYearlySupply(instituteCode)
                .orElseThrow(EntityNotFoundException::new)
                .toYearlySupplyAvgsDto();
    }
}
