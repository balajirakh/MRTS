package com.BikkatIT.MassRapidTransistSystem.Service;

import java.util.List;

import com.BikkatIT.MassRapidTransistSystem.entity.Customer;

public interface CustomerServiseI {

	public boolean saveCustomer(Customer customer);
	
	public Customer getCustomer(Integer id);
	
	public Customer updateCustomer(Customer customer,Integer id);
	
	public boolean deleteCustomer(Integer id);
	
	public List<Customer> getAllCustomer();
	

	
	
	
	
}
