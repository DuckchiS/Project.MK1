package com.example.projectfinal.entity.function;

import com.example.projectfinal.entity.Item;
import com.example.projectfinal.entity.Shop;
import com.example.projectfinal.entity.relationship.Order_Relationship;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders", schema = "order_schema")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Order_State;
    private int Order_Quantity;
    private int Order_Price;

    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
    List<Order_Relationship> order = new ArrayList<>();

    @Temporal(TemporalType.DATE)
    private Date date;
}
