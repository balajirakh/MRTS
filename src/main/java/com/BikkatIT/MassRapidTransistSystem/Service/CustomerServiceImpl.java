package com.BikkatIT.MassRapidTransistSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkatIT.MassRapidTransistSystem.entity.Customer;
import com.BikkatIT.MassRapidTransistSystem.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerServiseI {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public boolean saveCustomer(Customer customer) {

		Customer savecustomer = this.customerRepo.save(customer);

		if (savecustomer != null && customer.getId() != null) {

			return true;
		}

		return false;
	}

	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> findAll = this.customerRepo.findAll();
		return findAll;
	}

}
