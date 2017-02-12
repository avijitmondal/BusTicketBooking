/**
 * 
 */
package com.avijit.busticketbooking.service;

import com.avijit.busticketbooking.model.Fare;

/**
 * @author AVI
 *
 */
public interface IFareService {
	/**
	 * Add new fare to database
	 * 
	 * @param fare
	 * @return fareID
	 */
	public int addFare(Fare fare);

	/**
	 * Get fare details
	 * 
	 * @param fareID
	 * @return Fare
	 */
	public Fare getFare(int fareID);

	/**
	 * Update fare details
	 * 
	 * @param fare
	 * @return
	 */
	public boolean updateFare(Fare fare);

	/**
	 * Delete fare
	 * 
	 * @param fareID
	 * @return
	 */
	public boolean deleteFare(int fareID);
}
