package com.example.demo.model.web;

import com.example.demo.model.entity.OrderStatus;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class OrderResponse {

    private Long id;
    private OrderStatus orderTransitStatus;
    private OrderStatus orderPaymentStatus;
    private OrderStatus orderStatus;
    private LocalDateTime created;
    private LocalDateTime updated;

}
