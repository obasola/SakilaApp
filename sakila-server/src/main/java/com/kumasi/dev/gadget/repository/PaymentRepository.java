package com.kumasi.dev.gadget.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumasi.dev.gadget.domain.Customer;
import com.kumasi.dev.gadget.domain.Payment;
import com.kumasi.dev.gadget.domain.Staff;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	public List<Payment> findAll();
	public Payment findById(int id);
	public List<Payment> findByCustomer(Customer customer);
	public List<Payment> findByStaff(Staff staff);
	
}