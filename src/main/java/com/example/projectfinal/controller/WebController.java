package com.example.projectfinal.controller;

import com.example.projectfinal.entity.Orders;
import com.example.projectfinal.entity.Sale_Rate;
import com.example.projectfinal.service.WebService;
import com.example.projectfinal.vo.OrderVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class WebController {
    private WebService webService;

    public WebController(WebService webService){
        this.webService = webService;
    }

    @GetMapping("order")
    public ResponseEntity<Object> order(){
        List<OrderVO> orderVOList = webService.orders();

        return ResponseEntity.ok().body(orderVOList);
    }

    @GetMapping("detail")
    public ResponseEntity<Object> detail(int id){
        Sale_Rate saleRate = webService.detail(id);

        return ResponseEntity.ok().body(saleRate);
    }

}
