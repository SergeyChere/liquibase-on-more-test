package com.example.demo.converter;

import com.example.demo.model.entity.OrderStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class OrderConverter implements AttributeConverter<OrderStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(OrderStatus orderStatus) {
        return orderStatus == null ? OrderStatus.TODO.getId() : orderStatus.getId();
    }

    @Override
    public OrderStatus convertToEntityAttribute(Integer integer) {
        return integer == null ? OrderStatus.TODO : OrderStatus.getById(integer);
    }
}
