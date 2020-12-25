package com.kumasi.dev.gadget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumasi.dev.gadget.domain.Staff;
import com.kumasi.dev.gadget.service.StaffServiceImpl;

@RestController
public class StaffController {
	@Autowired
	private StaffServiceImpl service;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/rest/Staffs")
	public List<Staff> getStaffs() {
		
		return (List<Staff>) service.findAll();
	}
}
