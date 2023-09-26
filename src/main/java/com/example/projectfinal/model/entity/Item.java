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
@Table(name = "item", schema = "items_schema")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Item_Name;

    @ManyToOne
    private Category category;

    @OneToOne
    private Shop shop;

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    List<Sale_Rate> saleRates = new ArrayList<>();

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    List<Orders> orders = new ArrayList<>();

    @OneToOne
    private Predict_Sale predictSale;
}
