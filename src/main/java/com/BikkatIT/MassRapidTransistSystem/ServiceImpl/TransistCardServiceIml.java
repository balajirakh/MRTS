package com.BikkatIT.MassRapidTransistSystem.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkatIT.MassRapidTransistSystem.Service.TransistCardCustomerService;
import com.BikkatIT.MassRapidTransistSystem.entity.TransistCardCustomer;
import com.BikkatIT.MassRapidTransistSystem.repository.TransistCardDetailsRepo;

@Service
public class TransistCardServiceIml implements TransistCardCustomerService {
	
	@Autowired
	private TransistCardDetailsRepo trCardDetailsRepo;

	@Override
	public boolean saveTransistCardDetails(TransistCardCustomer tr) {

		TransistCardCustomer save = this.trCardDetailsRepo.save(tr);

		if (save != null && tr.getTransistId() != null) {
			return true;

		}

		return false;
	}

}
