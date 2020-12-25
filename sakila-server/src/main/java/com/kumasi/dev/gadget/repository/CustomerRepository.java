package com.kumasi.dev.gadget.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumasi.dev.gadget.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public List<Customer> findByLastName(String lname);
	public List<Customer> findAll();
	public Customer findByEmail(String email);
	public Customer findById(int id);
	public Customer save(Customer cust);
	public void delete(Customer customer);
}

