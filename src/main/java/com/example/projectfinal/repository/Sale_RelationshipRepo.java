package com.example.projectfinal.repository;

import com.example.projectfinal.entity.function.Orders;
import com.example.projectfinal.entity.relationship.Sale_Relationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sale_RelationshipRepo extends JpaRepository<Orders, String> {
    @Query("select b, w from Sale_Relationship b left outer join Shop w on b.shop = w")
    List<Sale_Relationship> getBoards();
}
