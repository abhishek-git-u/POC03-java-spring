package com.beep.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beep.ecom.entity.Cart;



public interface CartRepository extends JpaRepository<Cart, Integer> {
}
