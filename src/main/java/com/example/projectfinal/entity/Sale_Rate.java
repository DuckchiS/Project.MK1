package com.example.projectfinal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "saleRate", schema = "saleRate_schema")
public class Sale_Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int Item_Price;
    //당일 판매량
    private int Same_Day_Sale_Rate;

    @ManyToOne
    private Shop shop;
    @ManyToOne
    private Item item;
    @OneToOne
    private Predict_Sale predictSale;

    @Temporal(TemporalType.DATE)
    private Date date;
}
