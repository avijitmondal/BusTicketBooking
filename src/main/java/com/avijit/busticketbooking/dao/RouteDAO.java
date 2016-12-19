/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;

import com.avijit.busticketbooking.model.Route;

/**
 * @author avijit
 *
 */
public class RouteDAO implements IRouteDAO {
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
	public List<Route> findRoutesByOrigin(String origin) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IRouteDAO#findRoutesByDestination(java.lang
	 * .String)
	 */
	@Override
	public List<Route> findRoutesByDestination(String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IRouteDAO#findRouteByOriginAndDestination(
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public Route findRouteByOriginAndDestination(String origin, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busreservation.dao.IRouteDAO#findAllRoutes()
	 */
	@Override
	public List<Route> findAllRoutes() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listRoute;
	}

}
