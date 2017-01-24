/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Fare;

/**
 * @author avijit
 *
 */
public interface IFareDAO {
	
	/**
	 * 
	 * @param fare
	 * @return fareID
	 */
	@Transactional
	public int addFare(Fare fare);
	
	/**
	 * 
	 * @param fareID
	 * @return Fare
	 */
	@Transactional
	public Fare getFare(int fareID);
	
	/**
	 * 
	 * @param fare
	 * @return
	 */
	@Transactional
	public boolean updateFare(Fare fare);
	
	/**
	 * 
	 * @param fareID
	 * @return
	 */
	@Transactional
	public boolean deleteFare(int fareID);
}