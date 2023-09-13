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
@Table(name = "predictSale", schema = "predictSale_schema")
public class Predict_Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    //판매량 예측
    private int P_Sale_Rate;

    @ManyToOne
    private Item item;


    @Temporal(TemporalType.DATE)
    private Date date;
}
