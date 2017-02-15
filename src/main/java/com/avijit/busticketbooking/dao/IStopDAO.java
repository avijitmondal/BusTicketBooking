/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Stop;

/**
 * Access Stop table data
 * 
 * @author avijit
 *
 */
public interface IStopDAO {

	/**
	 * Add a new stop
	 * 
	 * @param stop
	 * @return int
	 */
	@Transactional
	public int addStop(Stop stop);

	/**
	 * Get a stop details
	 * 
	 * @param stopID
	 * @return Stop
	 */
	@Transactional
	public Stop getStop(int stopID);

	/**
	 * Update a stop details
	 * 
	 * @param stop
	 * @return boolean
	 */
	@Transactional
	public boolean updateStop(Stop stop);

	/**
	 * Delete a stop details
	 * 
	 * @param stopID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteStop(int stopID);

	/**
	 * Get list of stops
	 * 
	 */
	public List<Stop> getAllStops();
}
