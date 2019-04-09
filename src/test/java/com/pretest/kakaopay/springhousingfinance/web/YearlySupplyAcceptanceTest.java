package com.pretest.kakaopay.springhousingfinance.web;

import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupplyRepository;
import com.pretest.kakaopay.springhousingfinance.dto.YearMaxSupplyInstituteDto;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySuppliesDto;
import com.pretest.kakaopay.support.test.AcceptanceTest;
import com.pretest.kakaopay.support.test.RestJsonDataBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class YearlySupplyAcceptanceTest extends AcceptanceTest {
    private static final Logger logger = LoggerFactory.getLogger(YearlySupplyAcceptanceTest.class);
    private static RestJsonDataBuilder restJsonDataBuilder;

    @Autowired
    private YearlySupplyRepository yearlySupplyRepository;

    @Test
    public void yearlySupplies() {
        restJsonDataBuilder = new RestJsonDataBuilder("/yearlySupplies");

        ResponseEntity<YearlySuppliesDto> response = template().getForEntity(restJsonDataBuilder.getLocation(), YearlySuppliesDto.class);
        softly.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        YearlySuppliesDto yearlySuppliesDto = response.getBody();
        softly.assertThat(yearlySuppliesDto.getName()).isEqualTo("주택금융 공급현황");
        logger.debug("yearlySupplies : {}", yearlySuppliesDto);
    }

    @Test
    public void maxInstitute() {
        restJsonDataBuilder = new RestJsonDataBuilder("/yearlySupplies/institutes/max");

        ResponseEntity<YearMaxSupplyInstituteDto> response = template().getForEntity(restJsonDataBuilder.getLocation(), YearMaxSupplyInstituteDto.class);
        softly.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        YearMaxSupplyInstituteDto ymsi = response.getBody();
        logger.debug("ymsi : {}", ymsi);
        softly.assertThat(ymsi.getBank()).isEqualTo("주택도시기금");
        softly.assertThat(ymsi.getYear()).isEqualTo(2014);
    }
}