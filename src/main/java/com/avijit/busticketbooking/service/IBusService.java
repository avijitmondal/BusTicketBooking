/**
 * 
 */
package com.avijit.busticketbooking.service;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Bus;

/**
 * @author avijit
 *
 */
public interface IBusService {
	/**
	 * 
	 * @param bus
	 * @return
	 */
	@Transactional
	public boolean addBus(Bus bus);

	/**
	 * 
	 * @param busID
	 * @return
	 */
	@Transactional
	public Bus getBus(int busID);

	/**
	 * 
	 * @param bus
	 * @return
	 */
	@Transactional
	public boolean updateBus(Bus bus);

	/**
	 * 
	 * @param busID
	 * @return
	 */
	@Transactional
	public boolean deleteBus(int busID);
}
