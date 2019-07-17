package com.example.demo.converter;

import com.example.demo.model.entity.Order;
import com.example.demo.model.web.OrderRequest;
import com.example.demo.model.entity.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class ConverterToEntity {

    public Order convertToEntity(OrderRequest orderRequest) {
        return Order.builder()
                .orderTransitStatus(OrderStatus.getByName(orderRequest.getName()))
                .orderTransitStatus(OrderStatus.getById(orderRequest.getId()))
                .orderPaymentStatus(OrderStatus.getByName(orderRequest.getName()))
                .orderPaymentStatus(OrderStatus.getById(orderRequest.getId()))
                .orderStatus(OrderStatus.getByName(orderRequest.getName()))
                .orderStatus(OrderStatus.getById(orderRequest.getId()))
                .build();
    }
}
