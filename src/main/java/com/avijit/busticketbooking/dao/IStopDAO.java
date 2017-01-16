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
	 * @return
	 */
	@Transactional
	public boolean addStop(Stop stop);
	
	/**
	 * 
	 * @param stopID
	 * @return
	 */
	@Transactional
	public Stop getStop(int stopID);
	
	/**
	 * 
	 * @param stop
	 * @return
	 */
	@Transactional
	public boolean updateStop(Stop stop);
	
	/**
	 * 
	 * @param stopID
	 * @return
	 */
	@Transactional
	public boolean deleteStop(int stopID);
}
