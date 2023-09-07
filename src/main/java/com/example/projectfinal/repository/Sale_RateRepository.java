package com.example.projectfinal.repository;

import com.example.projectfinal.entity.Sale_Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sale_RateRepository extends JpaRepository<Sale_Rate, Integer> {

}
