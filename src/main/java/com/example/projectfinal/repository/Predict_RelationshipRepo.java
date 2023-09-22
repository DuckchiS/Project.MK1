package com.example.projectfinal.repository;

import com.example.projectfinal.entity.function.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Predict_RelationshipRepo extends JpaRepository<Orders, String> {
}
