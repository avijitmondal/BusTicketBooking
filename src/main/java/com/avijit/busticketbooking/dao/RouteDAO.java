/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

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
	@SuppressWarnings("unchecked")
	public List<Route> findRoutesByOrigin(int origin) {
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
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class)
				.add(Restrictions.eq("destination", destination)).list();
		return listRoute;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busreservation.dao.IRouteDAO#findRouteByOriginAndDestination(
	 * java.lang.String, java.lang.String)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Route> findRouteByOriginAndDestination(int origin, int destination) {
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class)
				.add(Restrictions.eq("origin", origin))
				.add(Restrictions.eq("destination", destination)).list();
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
		List<Route> listRoute = (List<Route>) sessionFactory.getCurrentSession().createCriteria(Route.class).list();
		// .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)

		return listRoute;
	}

}
