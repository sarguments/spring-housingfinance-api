package com.pretest.kakaopay.springhousingfinance.job;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class IntValueEditor extends PropertyEditorSupport {
    private static String COMMA = ",";
    private static String DOUBLE_QUOTE = "\"";

    @Override
    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        if (StringUtils.isEmpty(text)) {
            setValue(null);
        } else {
            setValue(strToInt(text));
        }
    }

    public int strToInt(String value) {
        return Integer.parseInt(value.replaceAll(COMMA, "")
                .replaceAll(DOUBLE_QUOTE, ""));
    }
}
