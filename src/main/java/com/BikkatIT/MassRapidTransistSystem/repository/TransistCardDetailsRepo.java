package com.BikkatIT.MassRapidTransistSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkatIT.MassRapidTransistSystem.entity.TransistCardCustomer;

@Repository
public interface TransistCardDetailsRepo extends JpaRepository<TransistCardCustomer, Integer> {

}
