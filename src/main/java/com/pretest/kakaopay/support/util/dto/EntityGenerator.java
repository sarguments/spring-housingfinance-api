package com.pretest.kakaopay.support.util.dto;

import com.pretest.kakaopay.springhousingfinance.domain.monthlydata.InstituteMonthlyData;
import com.pretest.kakaopay.springhousingfinance.domain.yeardata.YearData;
import com.pretest.kakaopay.springhousingfinance.domain.yearlydata.InstituteYearlyData;
import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;

import java.util.ArrayList;
import java.util.List;

import static com.pretest.kakaopay.springhousingfinance.vo.InstituteCode.*;

public class EntityGenerator {
    public static List<InstituteMonthlyData> generateMonthlyDatas(CsvDataDto csvDataDto) {
        List<InstituteMonthlyData> datas = new ArrayList<>();

        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getHcf(), csvDataDto.getYear(), HOUSING_CITY_FUND));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk006(), csvDataDto.getYear(), KB_BANK));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk020(), csvDataDto.getYear(), WR_BANK));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk021(), csvDataDto.getYear(), SH_BANK));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk027(), csvDataDto.getYear(), CT_BANK));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk081(), csvDataDto.getYear(), HN_BANK));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk095(), csvDataDto.getYear(), NH_BANK));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk005(), csvDataDto.getYear(), KE_BANK));
        datas.add(generateMonthlyData(csvDataDto.getMonth(), csvDataDto.getBnk999(), csvDataDto.getYear(), ETC_BANK));

        return datas;
    }

    private static InstituteMonthlyData generateMonthlyData(Integer month, Integer monthlyData, Integer year, InstituteCode instituteCode) {
        InstituteMonthlyData data = new InstituteMonthlyData(year, instituteCode.getInstituteCode(), month, monthlyData);
        data.setInstituteYearlyData(generateYearlyData(year, instituteCode));

        return data;
    }

    private static InstituteYearlyData generateYearlyData(Integer year, InstituteCode instituteCode) {
        InstituteYearlyData data = new InstituteYearlyData(year, instituteCode.getInstituteCode());
        data.setYearData(new YearData(year));
        data.setSupplyInstitute(instituteCode.convertEntity());
        return data;
    }
}
