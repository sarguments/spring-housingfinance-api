package com.pretest.kakaopay.springhousingfinance.web;

import com.pretest.kakaopay.springhousingfinance.dto.InstitutesDto;
import com.pretest.kakaopay.support.test.AcceptanceTest;
import com.pretest.kakaopay.support.test.RestJsonDataBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class InstituteAcceptanceTest extends AcceptanceTest {
    private static final Logger logger = LoggerFactory.getLogger(InstituteAcceptanceTest.class);
    private static RestJsonDataBuilder restJsonDataBuilder;

    @Test
    public void institutes() {
        restJsonDataBuilder = new RestJsonDataBuilder("/institutes");

        ResponseEntity<InstitutesDto> response = template().getForEntity(restJsonDataBuilder.getLocation(), InstitutesDto.class);
        softly.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        InstitutesDto institutesDto = response.getBody();
        softly.assertThat(institutesDto.getName()).isEqualTo("주택금융 공급업체");
        logger.debug("instituteDto : {}", institutesDto);
    }

}