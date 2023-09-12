package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Builder
public class Sale_RateVO {
    private int i_id;
    private String i_name;
    private String s_name;
    private int s_id;
    private int sale;

    @Temporal(TemporalType.DATE)
    private Date date;

    private int sale_predict;
}
