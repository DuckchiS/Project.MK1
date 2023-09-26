package com.example.projectfinal.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shop", schema = "shop_schema")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Shop_Name;

    @OneToOne
    private Item item;

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY)
    List<Sale_Rate> saleRates = new ArrayList<>();

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY)
    List<Orders> orders = new ArrayList<>();

    @OneToOne
    private Predict_Sale predictSale;
}
