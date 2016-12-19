/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import com.avijit.busticketbooking.model.Route;

/**
 * @author avijit
 *
 */
public interface IRouteDAO {
	//Read
	public List<Route> findRoutesByOrigin(String origin);
	public List<Route> findRoutesByDestination(String destination);
	public Route findRouteByOriginAndDestination(String origin, String destination);
	public List<Route> findAllRoutes();
}
