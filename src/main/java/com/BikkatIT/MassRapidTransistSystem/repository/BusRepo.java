package com.BikkatIT.MassRapidTransistSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkatIT.MassRapidTransistSystem.entity.Bus;
@Repository
public interface BusRepo extends JpaRepository<Bus, Integer> {

	
	
}
