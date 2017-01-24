/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Stop;

/**
 * @author avijit
 *
 */
public interface IStopDAO {
	
	/**
	 * 
	 * @param stop
	 * @return int
	 */
	@Transactional
	public int addStop(Stop stop);
	
	/**
	 * 
	 * @param stopID
	 * @return Stop
	 */
	@Transactional
	public Stop getStop(int stopID);
	
	/**
	 * 
	 * @param stop
	 * @return boolean
	 */
	@Transactional
	public boolean updateStop(Stop stop);
	
	/**
	 * 
	 * @param stopID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteStop(int stopID);
}
