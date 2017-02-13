/**
 * 
 */
package com.avijit.busticketbooking.service;

import com.avijit.busticketbooking.model.Stop;

/**
 * @author AVI
 *
 */
public interface IStopService {

	/**
	 * Add a new stop
	 * 
	 * @param stop
	 * @return int
	 */
	public int addStop(Stop stop);

	/**
	 * Get a stop details
	 * 
	 * @param stopID
	 * @return Stop
	 */
	public Stop getStop(int stopID);

	/**
	 * Update a stop details
	 * 
	 * @param stop
	 * @return boolean
	 */
	public boolean updateStop(Stop stop);

	/**
	 * Delete a stop details
	 * 
	 * @param stopID
	 * @return boolean
	 */
	public boolean deleteStop(int stopID);
}
