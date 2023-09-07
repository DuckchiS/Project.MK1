package com.example.projectfinal.entity;

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
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Shop_ID;
    private String Shop_Name;

    @OneToMany(mappedBy = "Shop", fetch = FetchType.EAGER)
    List<Sale_Rate> saleRates = new ArrayList<>();
}
