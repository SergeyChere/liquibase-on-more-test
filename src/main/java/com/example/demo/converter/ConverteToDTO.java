package com.example.demo.converter;

import com.example.demo.model.entity.Order;
import com.example.demo.model.web.OrderResponse;
import org.springframework.stereotype.Component;

@Component
public class ConverteToDTO {

    public OrderResponse convertToDTO(Order order) {
        return OrderResponse.builder()
                .id(order.getId())
                .orderTransitStatus(order.getOrderTransitStatus())
                .orderPaymentStatus(order.getOrderPaymentStatus())
                .orderStatus(order.getOrderStatus())
                .created(order.getCreatedOn())
                .updated(order.getUpdatedOn())
                .build();
    }
}
