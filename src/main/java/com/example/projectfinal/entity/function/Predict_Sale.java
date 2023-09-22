package com.example.projectfinal.entity.function;

import com.example.projectfinal.entity.Item;
import com.example.projectfinal.entity.Shop;
import com.example.projectfinal.entity.relationship.Predict_Relationship;
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
@Table(name = "predictSale", schema = "predictSale_schema")
public class Predict_Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    //판매량 예측
    private float P_Sale_Rate;
    private int item_cnt;

    @OneToMany(mappedBy = "predictSale", fetch = FetchType.LAZY)
    List<Predict_Relationship> predict = new ArrayList<>();

    @OneToMany(mappedBy = "predictSale", fetch = FetchType.LAZY)
    List<Sale_Relationship> sale = new ArrayList<>();

//    @Temporal(TemporalType.DATE)
//    private Date date;

}
