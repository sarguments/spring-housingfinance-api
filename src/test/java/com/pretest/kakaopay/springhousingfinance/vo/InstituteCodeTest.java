package com.pretest.kakaopay.springhousingfinance.vo;

import com.pretest.kakaopay.support.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class InstituteCodeTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(InstituteCodeTest.class);

    @Test
    public void getCodes() {
        List<String> result = InstituteCode.getCodes();
        for (String code : result) {
            logger.debug("code : {}", code);
        }
    }
}