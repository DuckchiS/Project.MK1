package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Builder
public class OrderVO {
    @Temporal(TemporalType.DATE)
    private Date date;

    private int s_id;
    private String s_name;
    private String i_name;
    private int quantity;
    private String State;
}
