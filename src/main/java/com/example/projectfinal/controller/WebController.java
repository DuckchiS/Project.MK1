package com.example.projectfinal.controller;

import com.example.projectfinal.entity.Orders;
import com.example.projectfinal.entity.Sale_Rate;
import com.example.projectfinal.service.WebService;
import com.example.projectfinal.vo.OrderVO;
import com.example.projectfinal.vo.Sale_RateVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class WebController {
    private WebService webService;

    public WebController(WebService webService){
        this.webService = webService;
    }

    @GetMapping("/")
    public ResponseEntity<Object> Main(){
        List<Sale_RateVO> saleRateVOList1 = webService.Main();

        return ResponseEntity.ok().body(saleRateVOList1);
    }

    @GetMapping("/orders")
    public ResponseEntity<Object> Order(){
        List<OrderVO> orderVOList = webService.Orders();

        return ResponseEntity.ok().body(orderVOList);
    }

    @GetMapping("/detail")
    public ResponseEntity<Object> Detail(){
        List<Sale_RateVO> saleRateVOList = webService.Detail();

        return ResponseEntity.ok().body(saleRateVOList);
    }

}
