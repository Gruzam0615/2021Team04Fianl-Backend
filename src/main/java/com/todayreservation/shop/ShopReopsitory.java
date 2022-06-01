package com.todayreservation.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// @Repository
// public interface ShopReopsitory extends JpaRepository <Shop, Long> {
    
// }
@Repository
public interface ShopReopsitory extends CrudRepository <Shop, Long> {
    
}
