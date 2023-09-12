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
    private ItemRepository itemRepository;
    private Predict_SaleRepository predictSaleRepository;
    private ShopRepository shopRepository;

    public WebService(Sale_RateRepository saleRateRepository,
                      OrderRepository orderRepository,
                      ItemRepository itemRepository,
                      Predict_SaleRepository predictSaleRepository,
                      ShopRepository shopRepository){
        this.saleRateRepository = saleRateRepository;
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
        this.predictSaleRepository = predictSaleRepository;
        this.shopRepository = shopRepository;
    }

    public List<Sale_RateVO> main(){
        List<Sale_Rate> result = saleRateRepository.getBoards();

        List<Sale_RateVO> saleRateVOList = result.stream().map(
                saleRate -> Sale_RateVO.builder()
                        .sale(saleRate.getSame_Day_Sale_Rate())
                        .date(saleRate.getDate())
                        .build()
        ).collect(Collectors.toList());
        return saleRateVOList;
    }

    public List<Sale_RateVO> detail(){
        List<Sale_Rate> result = saleRateRepository.getBoards();

        List<Sale_RateVO> saleRateVOList = result.stream().map(
                saleRate -> Sale_RateVO.builder()
                        .sale(saleRate.getSame_Day_Sale_Rate())
                        .date(saleRate.getDate())
                        .build()
        ).collect(Collectors.toList());
        return saleRateVOList;
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
