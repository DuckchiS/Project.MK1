package com.example.projectfinal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "itemquantity", schema = "itemquantity_schema")
public class Item_Quantity {
    @Id
    private int ID;

    @ManyToOne
    private Item item;
    private int Quantity;
}
