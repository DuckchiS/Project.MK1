package com.example.projectfinal.repository;

import com.example.projectfinal.entity.Sale_Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sale_RateRepository extends JpaRepository<Sale_Rate, Integer> {
    @Query("select b, w from Sale_Rate b left outer join Shop w on b.shop = w")
    List<Sale_Rate> getBoards();
}
