package com.beep.ecom.service;
import com.beep.ecom.entity.ProductInOrder;
import com.beep.ecom.entity.User;



public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
