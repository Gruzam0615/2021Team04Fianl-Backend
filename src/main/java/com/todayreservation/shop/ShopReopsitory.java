package com.todayreservation.shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopReopsitory extends JpaRepository <Shop, Long> {
    
}
