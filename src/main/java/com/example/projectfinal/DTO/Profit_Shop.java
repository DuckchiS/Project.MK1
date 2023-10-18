package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Builder
public class Profit_Shop {
    private String shop_name;
    private int date_profit;

    @Temporal(TemporalType.DATE)
    private Date date;
}
