package com.pretest.kakaopay.support.util;

import com.pretest.kakaopay.springhousingfinance.domain.institute.Institute;
import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupply;
import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupply;
import com.pretest.kakaopay.springhousingfinance.dto.InstituteDto;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyAvgDto;
import com.pretest.kakaopay.springhousingfinance.dto.YearlySupplyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConverterUtil {
    public static List<InstituteDto> institutesToDto(List<Institute> rowData) {
        return rowData.stream().map(i -> i.toDto()).collect(Collectors.toList());
    }

    public static List<YearlySupplyDto> yearlySuppliesToDto(List<YearlySupply> rowData) {
        return rowData.stream().map(y -> y.toDto()).collect(Collectors.toList());
    }

    public static List<YearlySupplyAvgDto> generateYearlyAvgsDto(Set<YearlyInstituteSupply> rowData) {
        return findMaxAndMinAvg(rowData.stream()
                .filter(y -> y.is12Months())
                .map(y -> y.toYearlySupplyAvgDto())
                .collect(Collectors.toList()));
    }

    private static List<YearlySupplyAvgDto> findMaxAndMinAvg(List<YearlySupplyAvgDto> dtos) {
        List<YearlySupplyAvgDto> result = new ArrayList<>();

        if (dtos.size() == 0)
            return result;

        Collections.sort(dtos);
        result.add(dtos.get(0));
        result.add(dtos.get(dtos.size() - 1));

        return result;
    }
}
