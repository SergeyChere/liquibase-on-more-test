package com.example.demo.service;

import com.example.demo.model.web.OrderRequest;
import com.example.demo.model.web.OrderResponse;

import java.util.List;

public interface OrderService {
    List<OrderResponse> getAll();
    OrderResponse getById(Long id);
    OrderResponse saveOrder(OrderRequest orderRequest);
}
