package service;

import bussiness.Order;

import java.util.List;

public interface IOrderService extends IGeneric<Order, Integer> {
    Order findCartByUserId(int userId);

    int getNewId();

    List<Order> getListOrderByUserId(int userId);
}
