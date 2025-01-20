package com.BikkatIT.MassRapidTransistSystem.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkatIT.MassRapidTransistSystem.Service.BusService;
import com.BikkatIT.MassRapidTransistSystem.entity.Bus;
import com.BikkatIT.MassRapidTransistSystem.repository.BusRepo;

@Service
public class BusServiceImpl implements BusService {
	@Autowired
	private BusRepo busRepo;

	@Override
	public boolean saveBusDetails(Bus bus) {

		Bus save = this.busRepo.save(bus);
		
		if(save !=null && bus.getBusId() !=null) {
			
			return true;
		}
		
		return false;
	}

}
