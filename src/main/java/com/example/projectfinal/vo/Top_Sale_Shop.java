package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Top_Sale_Shop {
    private int shop_id;
    private String shop_name;
    private int sale_sum;
}
