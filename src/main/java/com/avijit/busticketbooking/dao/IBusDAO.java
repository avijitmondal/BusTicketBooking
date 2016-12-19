/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Bus;

/**
 * @author AVI
 *
 */
public interface IBusDAO {
	// Create
	@Transactional
	public void addBus(Bus bus);

	// Read
	@Transactional
	public List<Bus> listBuses();

	// Update
	@Transactional
	public void updateBus(Bus bus);

	// Delete
	@Transactional
	public void deleteBus(int id);
}
