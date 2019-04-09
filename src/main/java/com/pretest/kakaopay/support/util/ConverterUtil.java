package com.pretest.kakaopay.support.util;

import com.pretest.kakaopay.springhousingfinance.domain.institute.Institute;
import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupply;
import com.pretest.kakaopay.springhousingfinance.dto.InstituteDto;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyDto;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterUtil {
    public static List<InstituteDto> institutesToDto(List<Institute> rowData) {
        return rowData.stream().map(i -> i.toDto()).collect(Collectors.toList());
    }

    public static List<YearlySupplyDto> yearlySuppliesToDto(List<YearlySupply> rowData) {
        return rowData.stream().map(y -> y.toDto()).collect(Collectors.toList());
    }
}
