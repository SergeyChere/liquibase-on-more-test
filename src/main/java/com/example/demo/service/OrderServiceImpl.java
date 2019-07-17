package com.example.demo.service;

import com.example.demo.converter.ConverteToDTO;
import com.example.demo.converter.ConverterToEntity;
import com.example.demo.model.entity.Order;
import com.example.demo.model.web.OrderRequest;
import com.example.demo.model.web.OrderResponse;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ConverterToEntity converterToEntity;

    @Autowired
    ConverteToDTO converteToDTO;

    @Override
    public List<OrderResponse> getAll() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map(order -> converteToDTO.convertToDTO(order)).collect(Collectors.toList());
    }

    @Override
    public OrderResponse getById(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(null);
        return converteToDTO.convertToDTO(order);

    }

    @Override
    public OrderResponse saveOrder(OrderRequest orderRequest) {
        Order order = converterToEntity.convertToEntity(orderRequest);
        orderRepository.save(order);
        return converteToDTO.convertToDTO(order);

    }
}
