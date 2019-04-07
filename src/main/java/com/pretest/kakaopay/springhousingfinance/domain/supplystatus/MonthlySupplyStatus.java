package com.pretest.kakaopay.springhousingfinance.domain.supplystatus;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class MonthlySupplyStatus {

    @EmbeddedId
    private StatusId statusId;





}
