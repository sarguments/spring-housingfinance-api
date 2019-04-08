package com.pretest.kakaopay.support.test;

import com.pretest.kakaopay.support.util.fixture.Fixture;
import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;

public class BaseTest extends Fixture {
    @Rule
    public JUnitSoftAssertions softly = new JUnitSoftAssertions();
}