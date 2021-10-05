package com.boot.api.repository;

import org.springframework.data.repository.CrudRepository;


import com.boot.api.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	public Customer findByCustid(int custid); 
}
