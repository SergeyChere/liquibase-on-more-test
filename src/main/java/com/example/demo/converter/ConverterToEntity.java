package com.example.demo.converter;

import com.example.demo.model.entity.Order;
import com.example.demo.model.web.OrderRequest;
import com.example.demo.model.entity.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class ConverterToEntity {

    public Order convertToEntity(OrderRequest orderRequest) {
        return Order.builder()
                .orderTransitStatus(OrderStatus.getById(orderRequest.getOrderTransitStatus()))
                .orderPaymentStatus(OrderStatus.getById(orderRequest.getOrderPaymentStatus()))
                .orderStatus(OrderStatus.getById(orderRequest.getOrderStatus()))
                .build();
    }
}