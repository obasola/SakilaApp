package com.kumasi.dev.gadget.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumasi.dev.gadget.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Integer> {

	public Store findById(int id);
	public List<Store> findAll();
}
