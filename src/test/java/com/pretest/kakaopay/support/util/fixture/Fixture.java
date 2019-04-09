package com.pretest.kakaopay.support.util.fixture;

import com.pretest.kakaopay.springhousingfinance.domain.institute.Institute;
import com.pretest.kakaopay.springhousingfinance.domain.institutemonthlysupply.InstituteMonthlySupply;
import com.pretest.kakaopay.springhousingfinance.domain.yearlyinstitutesupply.YearlyInstituteSupply;
import com.pretest.kakaopay.springhousingfinance.domain.yearlysupply.YearlySupply;
import com.pretest.kakaopay.springhousingfinance.dto.CsvDataDto;
import com.pretest.kakaopay.springhousingfinance.vo.InstituteCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Fixture {
    private static final int YEAR = 2017;

    // instituteCodes
    private static final String HCF = InstituteCode.HOUSING_CITY_FUND.getInstituteCode();
    private static final String KB = InstituteCode.KB_BANK.getInstituteCode();
    private static final String WR = InstituteCode.WR_BANK.getInstituteCode();
    private static final String SH = InstituteCode.SH_BANK.getInstituteCode();
    private static final String CT = InstituteCode.CT_BANK.getInstituteCode();
    private static final String HN = InstituteCode.HN_BANK.getInstituteCode();
    private static final String NH = InstituteCode.NH_BANK.getInstituteCode();
    private static final String KE = InstituteCode.KE_BANK.getInstituteCode();
    private static final String ETC = InstituteCode.ETC_BANK.getInstituteCode();

    // CsvDataDto
    protected static CsvDataDto CSV_DATA_DTO_FIXTURE = new CsvDataDto(
            2015,
            1,
            90,
            10,
            11,
            100,
            1113,
            84,
            23,
            999,
            84
    );

    // InstituteMonthlySupply
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_1 = new InstituteMonthlySupply(YEAR, HCF, 1, 6159);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_2 = new InstituteMonthlySupply(YEAR, HCF, 2, 8290);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_3 = new InstituteMonthlySupply(YEAR, HCF, 3, 8936);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_4 = new InstituteMonthlySupply(YEAR, HCF, 4, 8500);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_5 = new InstituteMonthlySupply(YEAR, HCF, 5, 7823);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_6 = new InstituteMonthlySupply(YEAR, HCF, 6, 8060);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_7 = new InstituteMonthlySupply(YEAR, HCF, 7, 8394);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_8 = new InstituteMonthlySupply(YEAR, HCF, 8, 10188);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_9 = new InstituteMonthlySupply(YEAR, HCF, 9, 10705);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_1_10 = new InstituteMonthlySupply(YEAR, HCF, 10, 8354);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_1 = new InstituteMonthlySupply(YEAR, KB, 1, 1954);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_2 = new InstituteMonthlySupply(YEAR, KB, 2, 3278);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_3 = new InstituteMonthlySupply(YEAR, KB, 3, 1991);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_4 = new InstituteMonthlySupply(YEAR, KB, 4, 3054);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_5 = new InstituteMonthlySupply(YEAR, KB, 5, 2611);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_6 = new InstituteMonthlySupply(YEAR, KB, 6, 3287);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_7 = new InstituteMonthlySupply(YEAR, KB, 7, 2536);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_8 = new InstituteMonthlySupply(YEAR, KB, 8, 4140);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_9 = new InstituteMonthlySupply(YEAR, KB, 9, 5634);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_2_10 = new InstituteMonthlySupply(YEAR, KB, 10, 2995);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_1 = new InstituteMonthlySupply(YEAR, WR, 1, 3291);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_2 = new InstituteMonthlySupply(YEAR, WR, 2, 4554);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_3 = new InstituteMonthlySupply(YEAR, WR, 3, 3955);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_4 = new InstituteMonthlySupply(YEAR, WR, 4, 4682);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_5 = new InstituteMonthlySupply(YEAR, WR, 5, 4418);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_6 = new InstituteMonthlySupply(YEAR, WR, 6, 2700);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_7 = new InstituteMonthlySupply(YEAR, WR, 7, 2645);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_8 = new InstituteMonthlySupply(YEAR, WR, 8, 3833);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_9 = new InstituteMonthlySupply(YEAR, WR, 9, 4384);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_3_10 = new InstituteMonthlySupply(YEAR, WR, 10, 4384);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_1 = new InstituteMonthlySupply(YEAR, SH, 1, 1868);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_2 = new InstituteMonthlySupply(YEAR, SH, 2, 3842);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_3 = new InstituteMonthlySupply(YEAR, SH, 3, 3123);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_4 = new InstituteMonthlySupply(YEAR, SH, 4, 2971);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_5 = new InstituteMonthlySupply(YEAR, SH, 5, 3167);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_6 = new InstituteMonthlySupply(YEAR, SH, 6, 5540);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_7 = new InstituteMonthlySupply(YEAR, SH, 7, 4748);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_8 = new InstituteMonthlySupply(YEAR, SH, 8, 5610);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_9 = new InstituteMonthlySupply(YEAR, SH, 9, 5342);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_4_10 = new InstituteMonthlySupply(YEAR, SH, 10, 4518);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_1 = new InstituteMonthlySupply(YEAR, CT, 1, 1);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_2 = new InstituteMonthlySupply(YEAR, CT, 2, 1);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_3 = new InstituteMonthlySupply(YEAR, CT, 3, 2);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_4 = new InstituteMonthlySupply(YEAR, CT, 4, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_5 = new InstituteMonthlySupply(YEAR, CT, 5, 2);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_6 = new InstituteMonthlySupply(YEAR, CT, 6, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_7 = new InstituteMonthlySupply(YEAR, CT, 7, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_8 = new InstituteMonthlySupply(YEAR, CT, 8, 1);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_9 = new InstituteMonthlySupply(YEAR, CT, 9, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_5_10 = new InstituteMonthlySupply(YEAR, CT, 10, 0);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_1 = new InstituteMonthlySupply(YEAR, HN, 1, 2739);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_2 = new InstituteMonthlySupply(YEAR, HN, 2, 5746);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_3 = new InstituteMonthlySupply(YEAR, HN, 3, 2667);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_4 = new InstituteMonthlySupply(YEAR, HN, 4, 3123);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_5 = new InstituteMonthlySupply(YEAR, HN, 5, 4310);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_6 = new InstituteMonthlySupply(YEAR, HN, 6, 5350);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_7 = new InstituteMonthlySupply(YEAR, HN, 7, 3316);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_8 = new InstituteMonthlySupply(YEAR, HN, 8, 2295);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_9 = new InstituteMonthlySupply(YEAR, HN, 9, 4096);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_6_10 = new InstituteMonthlySupply(YEAR, HN, 10, 1987);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_1 = new InstituteMonthlySupply(YEAR, NH, 1, 993);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_2 = new InstituteMonthlySupply(YEAR, NH, 2, 3097);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_3 = new InstituteMonthlySupply(YEAR, NH, 3, 1950);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_4 = new InstituteMonthlySupply(YEAR, NH, 4, 1272);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_5 = new InstituteMonthlySupply(YEAR, NH, 5, 4264);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_6 = new InstituteMonthlySupply(YEAR, NH, 6, 2661);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_7 = new InstituteMonthlySupply(YEAR, NH, 7, 3262);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_8 = new InstituteMonthlySupply(YEAR, NH, 8, 4280);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_9 = new InstituteMonthlySupply(YEAR, NH, 9, 3754);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_7_10 = new InstituteMonthlySupply(YEAR, NH, 10, 1436);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_1 = new InstituteMonthlySupply(YEAR, KE, 1, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_2 = new InstituteMonthlySupply(YEAR, KE, 2, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_3 = new InstituteMonthlySupply(YEAR, KE, 3, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_4 = new InstituteMonthlySupply(YEAR, KE, 4, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_5 = new InstituteMonthlySupply(YEAR, KE, 5, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_6 = new InstituteMonthlySupply(YEAR, KE, 6, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_7 = new InstituteMonthlySupply(YEAR, KE, 7, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_8 = new InstituteMonthlySupply(YEAR, KE, 8, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_9 = new InstituteMonthlySupply(YEAR, KE, 9, 0);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_8_10 = new InstituteMonthlySupply(YEAR, KE, 10, 0);

    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_1 = new InstituteMonthlySupply(YEAR, ETC, 1, 2977);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_2 = new InstituteMonthlySupply(YEAR, ETC, 2, 6529);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_3 = new InstituteMonthlySupply(YEAR, ETC, 3, 4099);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_4 = new InstituteMonthlySupply(YEAR, ETC, 4, 1849);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_5 = new InstituteMonthlySupply(YEAR, ETC, 5, 3796);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_6 = new InstituteMonthlySupply(YEAR, ETC, 6, 4728);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_7 = new InstituteMonthlySupply(YEAR, ETC, 7, 3806);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_8 = new InstituteMonthlySupply(YEAR, ETC, 8, 2884);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_9 = new InstituteMonthlySupply(YEAR, ETC, 9, 3203);
    protected static InstituteMonthlySupply INSTITUTE_MONTHLY_SUPPLY_9_10 = new InstituteMonthlySupply(YEAR, ETC, 10, 2186);

    // InstituteMonthlySupplies
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_1 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_1_1,
            INSTITUTE_MONTHLY_SUPPLY_1_2,
            INSTITUTE_MONTHLY_SUPPLY_1_3,
            INSTITUTE_MONTHLY_SUPPLY_1_4,
            INSTITUTE_MONTHLY_SUPPLY_1_5,
            INSTITUTE_MONTHLY_SUPPLY_1_6,
            INSTITUTE_MONTHLY_SUPPLY_1_7,
            INSTITUTE_MONTHLY_SUPPLY_1_8,
            INSTITUTE_MONTHLY_SUPPLY_1_9,
            INSTITUTE_MONTHLY_SUPPLY_1_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_2 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_2_1,
            INSTITUTE_MONTHLY_SUPPLY_2_2,
            INSTITUTE_MONTHLY_SUPPLY_2_3,
            INSTITUTE_MONTHLY_SUPPLY_2_4,
            INSTITUTE_MONTHLY_SUPPLY_2_5,
            INSTITUTE_MONTHLY_SUPPLY_2_6,
            INSTITUTE_MONTHLY_SUPPLY_2_7,
            INSTITUTE_MONTHLY_SUPPLY_2_8,
            INSTITUTE_MONTHLY_SUPPLY_2_9,
            INSTITUTE_MONTHLY_SUPPLY_2_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_3 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_3_1,
            INSTITUTE_MONTHLY_SUPPLY_3_2,
            INSTITUTE_MONTHLY_SUPPLY_3_3,
            INSTITUTE_MONTHLY_SUPPLY_3_4,
            INSTITUTE_MONTHLY_SUPPLY_3_5,
            INSTITUTE_MONTHLY_SUPPLY_3_6,
            INSTITUTE_MONTHLY_SUPPLY_3_7,
            INSTITUTE_MONTHLY_SUPPLY_3_8,
            INSTITUTE_MONTHLY_SUPPLY_3_9,
            INSTITUTE_MONTHLY_SUPPLY_3_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_4 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_4_1,
            INSTITUTE_MONTHLY_SUPPLY_4_2,
            INSTITUTE_MONTHLY_SUPPLY_4_3,
            INSTITUTE_MONTHLY_SUPPLY_4_4,
            INSTITUTE_MONTHLY_SUPPLY_4_5,
            INSTITUTE_MONTHLY_SUPPLY_4_6,
            INSTITUTE_MONTHLY_SUPPLY_4_7,
            INSTITUTE_MONTHLY_SUPPLY_4_8,
            INSTITUTE_MONTHLY_SUPPLY_4_9,
            INSTITUTE_MONTHLY_SUPPLY_4_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_5 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_5_1,
            INSTITUTE_MONTHLY_SUPPLY_5_2,
            INSTITUTE_MONTHLY_SUPPLY_5_3,
            INSTITUTE_MONTHLY_SUPPLY_5_4,
            INSTITUTE_MONTHLY_SUPPLY_5_5,
            INSTITUTE_MONTHLY_SUPPLY_5_6,
            INSTITUTE_MONTHLY_SUPPLY_5_7,
            INSTITUTE_MONTHLY_SUPPLY_5_8,
            INSTITUTE_MONTHLY_SUPPLY_5_9,
            INSTITUTE_MONTHLY_SUPPLY_5_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_6 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_6_1,
            INSTITUTE_MONTHLY_SUPPLY_6_2,
            INSTITUTE_MONTHLY_SUPPLY_6_3,
            INSTITUTE_MONTHLY_SUPPLY_6_4,
            INSTITUTE_MONTHLY_SUPPLY_6_5,
            INSTITUTE_MONTHLY_SUPPLY_6_6,
            INSTITUTE_MONTHLY_SUPPLY_6_7,
            INSTITUTE_MONTHLY_SUPPLY_6_8,
            INSTITUTE_MONTHLY_SUPPLY_6_9,
            INSTITUTE_MONTHLY_SUPPLY_6_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_7 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_7_1,
            INSTITUTE_MONTHLY_SUPPLY_7_2,
            INSTITUTE_MONTHLY_SUPPLY_7_3,
            INSTITUTE_MONTHLY_SUPPLY_7_4,
            INSTITUTE_MONTHLY_SUPPLY_7_5,
            INSTITUTE_MONTHLY_SUPPLY_7_6,
            INSTITUTE_MONTHLY_SUPPLY_7_7,
            INSTITUTE_MONTHLY_SUPPLY_7_8,
            INSTITUTE_MONTHLY_SUPPLY_7_9,
            INSTITUTE_MONTHLY_SUPPLY_7_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_8 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_8_1,
            INSTITUTE_MONTHLY_SUPPLY_8_2,
            INSTITUTE_MONTHLY_SUPPLY_8_3,
            INSTITUTE_MONTHLY_SUPPLY_8_4,
            INSTITUTE_MONTHLY_SUPPLY_8_5,
            INSTITUTE_MONTHLY_SUPPLY_8_6,
            INSTITUTE_MONTHLY_SUPPLY_8_7,
            INSTITUTE_MONTHLY_SUPPLY_8_8,
            INSTITUTE_MONTHLY_SUPPLY_8_9,
            INSTITUTE_MONTHLY_SUPPLY_8_10
    ));
    protected static Set<InstituteMonthlySupply> INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_9 = new HashSet<>(Arrays.asList(
            INSTITUTE_MONTHLY_SUPPLY_9_1,
            INSTITUTE_MONTHLY_SUPPLY_9_2,
            INSTITUTE_MONTHLY_SUPPLY_9_3,
            INSTITUTE_MONTHLY_SUPPLY_9_4,
            INSTITUTE_MONTHLY_SUPPLY_9_5,
            INSTITUTE_MONTHLY_SUPPLY_9_6,
            INSTITUTE_MONTHLY_SUPPLY_9_7,
            INSTITUTE_MONTHLY_SUPPLY_9_8,
            INSTITUTE_MONTHLY_SUPPLY_9_9,
            INSTITUTE_MONTHLY_SUPPLY_9_10
    ));

    // YearlyInstituteSupply
    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_1 = new YearlyInstituteSupply(
            YEAR,
            HCF,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_1
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_2 = new YearlyInstituteSupply(
            YEAR,
            KB,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_2
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_3 = new YearlyInstituteSupply(
            YEAR,
            WR,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_3
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_4 = new YearlyInstituteSupply(
            YEAR,
            SH,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_4
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_5 = new YearlyInstituteSupply(
            YEAR,
            CT,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_5
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_6 = new YearlyInstituteSupply(
            YEAR,
            HN,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_6
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_7 = new YearlyInstituteSupply(
            YEAR,
            NH,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_7
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_8 = new YearlyInstituteSupply(
            YEAR,
            KE,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_8
    );

    protected static YearlyInstituteSupply YEARLY_INSTITUTE_SUPPLY_FIXTURE_9 = new YearlyInstituteSupply(
            YEAR,
            ETC,
            INSTITUTE_MONTHLY_SUPPLIES_FIXTURE_9
    );

    // YearlyInstituteSupplies
    protected static Set<YearlyInstituteSupply> YEARLY_INSTITUTE_SUPPLIES_FIXTURE = new HashSet<>(Arrays.asList(
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_1,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_2,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_3,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_4,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_5,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_6,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_7,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_8,
            YEARLY_INSTITUTE_SUPPLY_FIXTURE_9));

    // YearlySupply
    protected static YearlySupply YEARLY_SUPPLY_FIXTURE = new YearlySupply(YEAR, YEARLY_INSTITUTE_SUPPLIES_FIXTURE);

    // Institute
    protected static Institute INSTITUTE_FIXTURE = new Institute(
            InstituteCode.KE_BANK.getInstituteCode(),
            InstituteCode.KE_BANK.getInstituteName(),
            new HashSet<>(Arrays.asList(YEARLY_INSTITUTE_SUPPLY_FIXTURE_8))
    );
}
