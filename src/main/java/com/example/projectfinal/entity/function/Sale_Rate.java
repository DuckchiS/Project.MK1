package com.example.projectfinal.entity.function;

import com.example.projectfinal.entity.Item;
import com.example.projectfinal.entity.Shop;
import com.example.projectfinal.entity.relationship.Sale_Relationship;
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
@Table(name = "saleRate", schema = "saleRate_schema")
public class Sale_Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private int Item_Price;
    //당일 판매량
    private int Same_Day_Sale_Rate;

    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "saleRate", fetch = FetchType.LAZY)
    List<Sale_Relationship> sale = new ArrayList<>();
}
