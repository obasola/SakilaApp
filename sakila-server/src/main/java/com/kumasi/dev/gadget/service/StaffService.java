package com.kumasi.dev.gadget.service;

import java.util.List;

import com.kumasi.dev.gadget.domain.Staff;

public interface StaffService {
	public List<Staff> findAll();
	public List<Staff> findByLastName(String lname);
	public Staff findByEmail(String email);
	public Staff findById(int id);
	public Staff save(Staff cust);
	public void delete(Staff Staff);
}

