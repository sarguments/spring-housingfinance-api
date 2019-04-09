package com.pretest.kakaopay.springhousingfinance.service;

import com.pretest.kakaopay.springhousingfinance.domain.institute.InstituteRepository;
import com.pretest.kakaopay.springhousingfinance.dto.InstitutesDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituteService {
    private static final Logger logger = LoggerFactory.getLogger(InstituteService.class);

    private static final String INSTITUTES = "주택금융 공급업체";

    @Autowired
    private InstituteRepository instituteRepository;

    public InstitutesDto insititutes() {
        return new InstitutesDto(INSTITUTES, instituteRepository.findAll());
    }
}
