/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Route;

/**
 * Access Route table data and one-to-many relation with TimeTable and Midway
 * 
 * @author avijit
 *
 */
public interface IRouteDAO {

	/**
	 * Get list of routes
	 * 
	 * @param origin
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findRoutesByOrigin(int origin);

	/**
	 * Get list of routes
	 * 
	 * @param destination
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findRoutesByDestination(int destination);

	/**
	 * Get list of routes
	 * 
	 * @param origin
	 * @param destination
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findRouteByOriginAndDestination(int origin, int destination);

	/**
	 * Get list of routes
	 * 
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findAllRoutes();
}
