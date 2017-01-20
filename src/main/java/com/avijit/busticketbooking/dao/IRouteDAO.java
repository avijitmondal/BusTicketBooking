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
	 * @return
	 */
	@Transactional
	public List<Route> findRoutesByOrigin(String origin);

	/**
	 * 
	 * @param destination
	 * @return
	 */
	@Transactional
	public List<Route> findRoutesByDestination(String destination);

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 */
	@Transactional
	public Route findRouteByOriginAndDestination(String origin, String destination);

	/**
	 * 
	 * @return
	 */
	@Transactional
	public List<Route> findAllRoutes();
}
