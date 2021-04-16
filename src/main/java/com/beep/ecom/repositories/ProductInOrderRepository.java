package com.beep.ecom.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.beep.ecom.entity.ProductInOrder;


public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
