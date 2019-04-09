package com.pretest.kakaopay.support.job;

import com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply.InstituteMonthlySupply;
import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupply;
import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupply;
import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;

import java.util.ArrayList;
import java.util.List;

import static com.pretest.kakaopay.springhousingfinance.vo.InstituteCode.*;

public class EntityGenerator {
    public static List<InstituteMonthlySupply> generateMonthlyDatas(CsvDataDto csvDataDto) {
        List<InstituteMonthlySupply> datas = new ArrayList<>();

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

    private static InstituteMonthlySupply generateMonthlyData(Integer month, Integer monthlyData, Integer year, InstituteCode instituteCode) {
        InstituteMonthlySupply data = new InstituteMonthlySupply(year, instituteCode.getInstituteCode(), month, monthlyData);
        data.setYearlyInstituteSupply(generateYearlyData(year, instituteCode));

        return data;
    }

    private static YearlyInstituteSupply generateYearlyData(Integer year, InstituteCode instituteCode) {
        YearlyInstituteSupply data = new YearlyInstituteSupply(year, instituteCode.getInstituteCode());
        data.setYearlySupply(new YearlySupply(year));
        data.setInstitute(instituteCode.convertEntity());
        return data;
    }
}
