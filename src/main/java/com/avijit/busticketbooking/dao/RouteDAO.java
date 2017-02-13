/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avijit.busticketbooking.model.Route;

/**
 * Access Route table data and one-to-many relation with TimeTable and Midway
 * 
 * @author avijit
 *
 */
public class RouteDAO implements IRouteDAO {
	private static final Logger logger = LoggerFactory.getLogger(RouteDAO.class);
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public RouteDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IRouteDAO#findRoutesByOrigin(java.lang.
	 * String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Route> findRoutesByOrigin(int origin) {
		logger.info("findRoutesByOrigin");
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class)
				.add(Restrictions.eq("orignin", origin)).list();
		return listRoute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IRouteDAO#findRoutesByDestination(java.lang
	 * .String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Route> findRoutesByDestination(int destination) {
		logger.info("findRoutesByDestination");
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class)
				.add(Restrictions.eq("destination", destination)).list();
		return listRoute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IRouteDAO#findRoutesByOriginAndDestination(
	 * java.lang.String, java.lang.String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Route> findRoutesByOriginAndDestination(int origin, int destination) {
		logger.info("findRouteByOriginAndDestination");
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class)
				.add(Restrictions.eq("origin", origin)).add(Restrictions.eq("destination", destination)).list();
		return listRoute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busreservation.dao.IRouteDAO#findAllRoutes()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Route> findAllRoutes() {
		logger.info("findAllRoutes");
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class).list();
		return listRoute;
	}

}
