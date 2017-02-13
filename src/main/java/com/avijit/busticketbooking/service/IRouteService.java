/**
 * 
 */
package com.avijit.busticketbooking.service;

import java.util.List;

import com.avijit.busticketbooking.model.Route;

/**
 * @author AVI
 *
 */
public interface IRouteService {
	/**
	 * Get list of routes
	 * 
	 * @param origin
	 * @return list of Route
	 */
	public List<Route> findRoutesByOrigin(int origin);

	/**
	 * Get list of routes
	 * 
	 * @param destination
	 * @return list of Route
	 */
	public List<Route> findRoutesByDestination(int destination);

	/**
	 * Get list of routes
	 * 
	 * @param origin
	 * @param destination
	 * @return list of Route
	 */
	public List<Route> findRoutesByOriginAndDestination(int origin, int destination);

	/**
	 * Get list of routes
	 * 
	 * @return list of Route
	 */
	public List<Route> findAllRoutes();
}
