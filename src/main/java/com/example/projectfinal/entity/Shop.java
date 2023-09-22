package com.example.projectfinal.entity;

import com.example.projectfinal.entity.function.Orders;
import com.example.projectfinal.entity.function.Predict_Sale;
import com.example.projectfinal.entity.function.Sale_Rate;
import com.example.projectfinal.entity.relationship.Order_Relationship;
import com.example.projectfinal.entity.relationship.Predict_Relationship;
import com.example.projectfinal.entity.relationship.Sale_Relationship;
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

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY)
    List<Sale_Relationship> sale = new ArrayList<>();

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY)
    List<Order_Relationship> order = new ArrayList<>();

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY)
    List<Predict_Relationship> predict = new ArrayList<>();
}
