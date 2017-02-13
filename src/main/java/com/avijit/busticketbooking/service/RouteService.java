/**
 * 
 */
package com.avijit.busticketbooking.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.dao.IRouteDAO;
import com.avijit.busticketbooking.model.Route;

/**
 * @author AVI
 *
 */
public class RouteService implements IRouteService {

	private static final Logger logger = LoggerFactory.getLogger(RouteService.class);

	@Autowired
	private IRouteDAO iRouteDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IRouteService#findRoutesByOrigin(int)
	 */
	@Override
	public List<Route> findRoutesByOrigin(int origin) {
		List<Route> listRoutes = iRouteDAO.findRoutesByOrigin(origin);
		if (listRoutes != null)
			logger.info("findRoutesByOrigin", "Route by " + origin + " details successfuly retrived");
		else
			logger.error("findRoutesByOrigin", "Error retriving route by " + origin);
		return listRoutes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IRouteService#findRoutesByDestination
	 * (int)
	 */
	@Override
	public List<Route> findRoutesByDestination(int destination) {
		List<Route> listRoutes = iRouteDAO.findRoutesByDestination(destination);
		if (listRoutes != null)
			logger.info("findRoutesByDestination", "Route by " + destination + " details successfuly retrived");
		else
			logger.error("findRoutesByDestination", "Error retriving route by " + destination);
		return listRoutes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IRouteService#
	 * findRoutesByOriginAndDestination(int, int)
	 */
	@Override
	public List<Route> findRoutesByOriginAndDestination(int origin, int destination) {
		List<Route> listRoutes = iRouteDAO.findRoutesByOriginAndDestination(origin, destination);
		if (listRoutes != null)
			logger.info("findRoutesByOriginAndDestination",
					"Route by " + origin + " and " + destination + " details successfuly retrived");
		else
			logger.error("findRoutesByOriginAndDestination",
					"Error retriving route by " + origin + " and " + destination);
		return listRoutes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IRouteService#findAllRoutes()
	 */
	@Override
	public List<Route> findAllRoutes() {
		List<Route> listRoutes = iRouteDAO.findAllRoutes();
		if (listRoutes != null)
			logger.info("findAllRoutes", "All Route details successfuly retrived");
		else
			logger.error("findAllRoutes", "Error retriving route");
		return listRoutes;
	}

}
