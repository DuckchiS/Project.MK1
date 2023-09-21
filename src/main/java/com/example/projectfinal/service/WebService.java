package com.example.projectfinal.service;

import com.example.projectfinal.entity.Orders;
import com.example.projectfinal.entity.Sale_Rate;
import com.example.projectfinal.repository.*;
import com.example.projectfinal.vo.OrderVO;
import com.example.projectfinal.vo.Sale_RateVO;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Sale_RateVO> Main(){
        List<Sale_Rate> main = saleRateRepository.getBoards();

        List<Sale_RateVO> saleRateVOList = main.stream().map(
                saleRate -> Sale_RateVO.builder()
                        .sale(saleRate.getSame_Day_Sale_Rate())
                        .date(saleRate.getDate())
                        .s_id(saleRate.getPredictSale().getShop().getID())
                        .i_id(saleRate.getPredictSale().getItem().getID())
                        .s_name(saleRate.getPredictSale().getShop().getShop_Name())
                        .i_name(saleRate.getPredictSale().getItem().getItem_Name())
                        .sale_predict(saleRate.getPredictSale().getP_Sale_Rate())
                        .build()
        ).collect(Collectors.toList());
        return saleRateVOList;
    }

    public List<Sale_RateVO> Detail(){
        List<Sale_Rate> detail = saleRateRepository.getBoards();

        List<Sale_RateVO> saleRateVOList = detail.stream().map(
                saleRate -> Sale_RateVO.builder()
                        .sale(saleRate.getSame_Day_Sale_Rate())
                        .date(saleRate.getDate())
                        .s_id(saleRate.getPredictSale().getShop().getID())
                        .i_id(saleRate.getPredictSale().getItem().getID())
                        .s_name(saleRate.getPredictSale().getShop().getShop_Name())
                        .i_name(saleRate.getPredictSale().getItem().getItem_Name())
                        .sale_predict(saleRate.getPredictSale().getP_Sale_Rate())
                        .build()
        ).collect(Collectors.toList());
        return saleRateVOList;
    }

    public List<OrderVO> Orders(){
        List<Orders> order = orderRepository.getBoards();

        List<OrderVO> orderVOList = order.stream().map(
                orderEntity -> OrderVO.builder()
                        .date(orderEntity.getDate())
                        .s_id(orderEntity.getShop().getID())
                        .s_name(orderEntity.getShop().getShop_Name())
                        .i_name(orderEntity.getItem().getItem_Name())
                        .quantity(orderEntity.getOrder_Quantity())
                        .State(orderEntity.getOrder_State())
                        .Price(orderEntity.getOrder_Price())
                        .build()
        ).collect(Collectors.toList());

        return orderVOList;
    }

}
