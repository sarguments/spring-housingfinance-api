package com.pretest.kakaopay.support.util.job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineGenerator {
    public static String[] generateLine(String[] keys, List<String> values) {
        List<String> lines = new ArrayList<>(Arrays.asList(keys));
        lines.addAll(values);
        return lines.toArray(new String[lines.size()]);
    }
}
