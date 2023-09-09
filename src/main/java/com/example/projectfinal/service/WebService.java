package com.example.projectfinal.service;

import com.example.projectfinal.entity.Orders;
import com.example.projectfinal.entity.Sale_Rate;
import com.example.projectfinal.repository.*;
import com.example.projectfinal.vo.OrderVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class WebService {
    private Sale_RateRepository saleRateRepository;
    private OrderRepository orderRepository;

    public WebService(Sale_RateRepository saleRateRepository,
                      OrderRepository orderRepository){
        this.saleRateRepository = saleRateRepository;
        this.orderRepository = orderRepository;
    }

    public Sale_Rate detail(int id){
        Optional<Sale_Rate> result = saleRateRepository.findById(id);

        Sale_Rate saleRate = null;
        if(result.isPresent()) {
            saleRate = result.get();
        }
        return saleRate;
    }

    public List<OrderVO> orders(){
        List<Orders> result = orderRepository.getBoards();

        List<OrderVO> orderVOList = result.stream().map(
                orderEntity -> OrderVO.builder()
                        .date(orderEntity.getDate())
                        .id(orderEntity.getID())
                        .quantity(orderEntity.getOrder_Quantity())
                        .State(orderEntity.getOrder_State())
                        .price(orderEntity.getPrice())
                        .build()
        ).collect(Collectors.toList());

        return orderVOList;
    }

}
