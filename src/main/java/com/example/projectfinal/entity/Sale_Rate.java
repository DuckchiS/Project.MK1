package com.example.projectfinal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale_Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int Item_Price;
    private int Same_Day_Sale_Rate;

    @ManyToOne
    private Shop shop;
    @ManyToOne
    private Item item;

    @Temporal(TemporalType.DATE)
    private Date date;
}
