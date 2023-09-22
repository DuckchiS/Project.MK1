package com.example.projectfinal.repository;

import com.example.projectfinal.entity.function.Sale_Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sale_RateRepository extends JpaRepository<Sale_Rate, Integer> {

}
