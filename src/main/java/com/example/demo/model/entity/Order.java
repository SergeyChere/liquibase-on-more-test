package com.example.demo.model.entity;

import com.example.demo.converter.OrderConverter;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity @Table(name = "orders")
@Builder
public class Order extends BaseDate {

    @Column(name = "ORDER_TRANSIT_STATUS")
    @Convert(converter = OrderConverter.class)
    private OrderStatus orderTransitStatus;

    @Column(name = "ORDER_PAYMENT_STATUS")
    @Convert(converter = OrderConverter.class)
    private OrderStatus orderPaymentStatus;

    @Column(name = "ORDER_STATUS")
    @Convert(converter = OrderConverter.class)
    private OrderStatus orderStatus;
}
