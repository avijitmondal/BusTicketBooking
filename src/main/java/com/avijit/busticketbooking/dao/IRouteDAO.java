/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Route;

/**
 * @author avijit
 *
 */
public interface IRouteDAO {
	/**
	 * 
	 * @param origin
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findRoutesByOrigin(int origin);

	/**
	 * 
	 * @param destination
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findRoutesByDestination(int destination);

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findRouteByOriginAndDestination(int origin, int destination);

	/**
	 * 
	 * @return list of Route
	 */
	@Transactional
	public List<Route> findAllRoutes();
}
