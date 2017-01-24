/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Bus;

/**
 * @author AVI
 *
 */
public interface IBusDAO {

	/**
	 * 
	 * @param bus
	 * @return int
	 */
	@Transactional
	public int addBus(Bus bus);

	/**
	 * 
	 * @param busID
	 * @return Bus
	 */
	@Transactional
	public Bus getBus(int busID);

	/**
	 * 
	 * @param bus
	 * @return boolean
	 */
	@Transactional
	public boolean updateBus(Bus bus);

	/**
	 * 
	 * @param busID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteBus(int busID);
}
