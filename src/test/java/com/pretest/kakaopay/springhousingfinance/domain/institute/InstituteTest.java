package com.pretest.kakaopay.springhousingfinance.domain.institute;

import com.pretest.kakaopay.support.test.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstituteTest extends BaseTest {
    @Test
    public void toDto() {
        Institute institute = INSTITUTE_FIXTURE;
        softly.assertThat(institute.toDto().getName()).isEqualTo("외환은행");
    }
}