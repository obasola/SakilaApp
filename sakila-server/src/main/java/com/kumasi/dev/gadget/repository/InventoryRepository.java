package com.kumasi.dev.gadget.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumasi.dev.gadget.domain.Film;
import com.kumasi.dev.gadget.domain.Inventory;
import com.kumasi.dev.gadget.domain.Store;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
	public Inventory findById(int id);
	public List<Inventory> findAll();
	public List<Inventory> findByStore(Store store);
	public List<Inventory> findByFilm(Film film);
}
