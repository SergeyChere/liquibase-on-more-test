package com.example.demo.controller;

import com.example.demo.model.web.OrderRequest;
import com.example.demo.model.web.OrderResponse;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<OrderResponse> getAll(){
        return orderService.getAll();
    }

    @GetMapping("/orders/{id}")
    public OrderResponse getById(@PathVariable("id")Long id){
        return orderService.getById(id);
    }

    @PostMapping("/orders")
    public OrderResponse saveOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.saveOrder(orderRequest);
    }
}
