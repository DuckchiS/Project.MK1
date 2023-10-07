package com.example.projectfinal.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Total_Sale_Rank {
    private String item_name;
    private int total_daily_sales;
}
