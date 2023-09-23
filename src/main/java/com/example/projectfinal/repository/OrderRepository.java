package com.example.projectfinal.repository;

import com.example.projectfinal.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, String> {
    @Query("select b, w from Orders b left outer join Shop w on b.shop = w")
    List<Orders> getBoards();
}
