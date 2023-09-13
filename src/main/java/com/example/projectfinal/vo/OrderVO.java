package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Builder
public class OrderVO {
    private int s_id;
    private String s_name;
    private String State;
    private String i_name;
    private int price;
    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date date;
}
