package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product_Sale {
    private String category_name;
    private int sale_rate;
}
