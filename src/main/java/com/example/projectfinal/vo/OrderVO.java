package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Builder
public class OrderVO {
    private int id;
    private String name;
    private String State;
    private String pname;
    private int price;
    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date date;
}
