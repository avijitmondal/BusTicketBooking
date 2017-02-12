/**
 * 
 */
package com.avijit.busticketbooking.service;

import com.avijit.busticketbooking.model.Bus;

/**
 * @author avijit
 *
 */
public interface IBusService {
	/**
	 * Add new bus to database
	 * 
	 * @param bus
	 * @return bus id
	 */
	public int addBus(Bus bus);

	/**
	 * Get a bus details
	 * 
	 * @param busID
	 * @return
	 */
	public Bus getBus(int busID);

	/**
	 * Update a bus
	 * 
	 * @param bus
	 * @return
	 */
	public boolean updateBus(Bus bus);

	/**
	 * Delete a bus
	 * 
	 * @param busID
	 * @return
	 */
	public boolean deleteBus(int busID);
}
