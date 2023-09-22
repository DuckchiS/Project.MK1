package com.example.projectfinal.repository;

import com.example.projectfinal.entity.function.Orders;
import com.example.projectfinal.entity.relationship.Order_Relationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Order_RelationshipRepo extends JpaRepository<Orders, String> {
    @Query("select b, w from Order_Relationship b left outer join Shop w on b.shop = w")
    List<Order_Relationship> getBoards();
}
