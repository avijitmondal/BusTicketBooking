/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Bus;

/**
 * Access Bus table data
 * 
 * @author avijit
 *
 */
public interface IBusDAO {

	/**
	 * Add new bus.
	 *
	 * @param buss
	 * @return int
	 */
	@Transactional
	public int addBus(Bus bus);

	/**
	 * Get bus details
	 * 
	 * @param busID
	 * @return Bus
	 */
	@Transactional
	public Bus getBus(int busID);

	/**
	 * Update a bus
	 * 
	 * @param bus
	 * @return boolean
	 */
	@Transactional
	public boolean updateBus(Bus bus);

	/**
	 * Delete a bus details
	 * 
	 * @param busID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteBus(int busID);
}
