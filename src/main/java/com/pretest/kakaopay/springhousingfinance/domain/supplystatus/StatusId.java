package com.pretest.kakaopay.springhousingfinance.domain.supplystatus;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StatusId implements Serializable {
    @Column
    private Integer year;

    @Column
    private Integer month;

    public StatusId(Integer year, Integer month) {
        this.year = year;
        this.month = month;
    }
}
