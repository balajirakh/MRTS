package com.BikkatIT.MassRapidTransistSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkatIT.MassRapidTransistSystem.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
