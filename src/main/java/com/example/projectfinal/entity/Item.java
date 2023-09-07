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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Item_Name;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER)
    List<Sale_Rate> saleRates = new ArrayList<>();
}
