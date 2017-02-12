/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Fare;

/**
 * Access Fare table data
 * 
 * @author avijit
 *
 */
public interface IFareDAO {

	/**
	 * Add a new fare
	 * 
	 * @param fare
	 * @return fareID
	 */
	@Transactional
	public int addFare(Fare fare);

	/**
	 * Get a fare details
	 * 
	 * @param fareID
	 * @return Fare
	 */
	@Transactional
	public Fare getFare(int fareID);

	/**
	 * Update a bus details
	 * 
	 * @param fare
	 * @return
	 */
	@Transactional
	public boolean updateFare(Fare fare);

	/**
	 * Delete a bus details
	 * 
	 * @param fareID
	 * @return
	 */
	@Transactional
	public boolean deleteFare(int fareID);
}