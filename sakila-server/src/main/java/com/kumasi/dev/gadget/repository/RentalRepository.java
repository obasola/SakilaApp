package com.kumasi.dev.gadget.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumasi.dev.gadget.domain.Customer;
import com.kumasi.dev.gadget.domain.Rental;
import com.kumasi.dev.gadget.domain.Staff;

public interface RentalRepository extends JpaRepository<Rental, Integer> {

	public Rental findById(int id);
	public List<Rental> findByStaff(Staff staff);
	public List<Rental> findByCustomer(Customer customer);
	public List<Rental> findAll();
}
