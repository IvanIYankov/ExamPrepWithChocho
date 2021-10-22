package com.example.examprepwithchocho.service;

import com.example.examprepwithchocho.model.service.OrderServiceModel;
import com.example.examprepwithchocho.model.view.OrderViewModel;

import java.util.List;

public interface OrderService {
    void addOrder(OrderServiceModel orderServiceModel);

    List<OrderViewModel> findAllOrderByPriceDesc();

    void readyOrder(Long id);
}
