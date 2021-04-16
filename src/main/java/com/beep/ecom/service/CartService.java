package com.beep.ecom.service;

import java.util.Collection;

import com.beep.ecom.entity.Cart;
import com.beep.ecom.entity.ProductInOrder;
import com.beep.ecom.entity.User;

public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
