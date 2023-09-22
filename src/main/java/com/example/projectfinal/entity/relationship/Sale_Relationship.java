package com.example.projectfinal.entity.relationship;

import com.example.projectfinal.entity.Item;
import com.example.projectfinal.entity.Shop;
import com.example.projectfinal.entity.function.Predict_Sale;
import com.example.projectfinal.entity.function.Sale_Rate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale_Relationship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @ManyToOne
    private Shop shop;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Sale_Rate saleRate;
    @ManyToOne
    private Predict_Sale predictSale;
}
