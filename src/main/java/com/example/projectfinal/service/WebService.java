package com.example.projectfinal.service;

import com.example.projectfinal.entity.function.Orders;
import com.example.projectfinal.entity.function.Sale_Rate;
import com.example.projectfinal.entity.relationship.Order_Relationship;
import com.example.projectfinal.entity.relationship.Sale_Relationship;
import com.example.projectfinal.repository.*;
import com.example.projectfinal.vo.OrderVO;
import com.example.projectfinal.vo.Sale_RateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WebService {
    @Autowired
    private Sale_RateRepository saleRateRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private Sale_RelationshipRepo saleRelationshipRepo;
    @Autowired
    private Order_RelationshipRepo orderRelationshipRepo;
    @Autowired
    private Predict_SaleRepository predictSaleRepository;

    public List<Sale_RateVO> Main(){
        List<Sale_Relationship> main = saleRelationshipRepo.getBoards();

        List<Sale_RateVO> saleRateVOList = main.stream().map(
                saleRate -> Sale_RateVO.builder()
                        .sale(saleRate.getSaleRate().getSame_Day_Sale_Rate())
                        .date(saleRate.getSaleRate().getDate())
                        .s_id(saleRate.getShop().getID())
                        .i_id(saleRate.getItem().getID())
                        .s_name(saleRate.getShop().getShop_Name())
                        .i_name(saleRate.getItem().getItem_Name())
                        .sale_predict(saleRate.getPredictSale().getP_Sale_Rate())
                        .build()
        ).collect(Collectors.toList());
        return saleRateVOList;
    }

    public List<Sale_RateVO> Detail(){
        List<Sale_Relationship> detail = saleRelationshipRepo.getBoards();

        List<Sale_RateVO> saleRateVOList = detail.stream().map(
                saleRate -> Sale_RateVO.builder()
                        .sale(saleRate.getSaleRate().getSame_Day_Sale_Rate())
                        .date(saleRate.getSaleRate().getDate())
                        .s_id(saleRate.getShop().getID())
                        .i_id(saleRate.getItem().getID())
                        .s_name(saleRate.getShop().getShop_Name())
                        .i_name(saleRate.getItem().getItem_Name())
                        .sale_predict(saleRate.getPredictSale().getP_Sale_Rate())
                        .build()
        ).collect(Collectors.toList());
        return saleRateVOList;
    }

    public List<OrderVO> Orders(){
        List<Order_Relationship> order = orderRelationshipRepo.getBoards();

        List<OrderVO> orderVOList = order.stream().map(
                orderEntity -> OrderVO.builder()
                        .date(orderEntity.getOrders().getDate())
                        .quantity(orderEntity.getOrders().getOrder_Quantity())
                        .State(orderEntity.getOrders().getOrder_State())
                        .Price(orderEntity.getOrders().getOrder_Price())
                        .s_id(orderEntity.getShop().getID())
                        .s_name(orderEntity.getShop().getShop_Name())
                        .i_name(orderEntity.getItem().getItem_Name())
                        .build()
        ).collect(Collectors.toList());

        return orderVOList;
    }

}
