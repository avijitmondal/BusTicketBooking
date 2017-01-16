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
	 * @return
	 */
	@Transactional
	public boolean addFare(Fare fare);
	
	/**
	 * 
	 * @param fareID
	 * @return
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
	public boolean deleteFate(int fareID);
}