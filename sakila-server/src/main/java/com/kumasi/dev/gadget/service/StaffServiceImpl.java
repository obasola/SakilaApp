package com.kumasi.dev.gadget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kumasi.dev.gadget.domain.Staff;
import com.kumasi.dev.gadget.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffRepository repo;
	
	@Override
	public List<Staff> findByLastName(String lname) {
		return (List<Staff>) repo.findByLastName(lname);
	}

	@Override
	public Staff findByEmail(String email) {
		return repo.findByEmail(email);
	}

	@Override
	public Staff findById(int id) {
		return repo.findById(id);
	}

	@Override
	public Staff save(Staff cust) {
		return repo.save(cust);
	}

	@Override
	public void delete(Staff Staff) {
		repo.delete(Staff);
	}

	@Override
	public List<Staff> findAll() {
		return (List<Staff>) repo.findAll();
	}

}
