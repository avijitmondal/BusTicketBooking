/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avijit.busticketbooking.model.Stop;

/**
 * Access Stop table data
 * 
 * @author avijit
 *
 */
public class StopDAO implements IStopDAO {
	private static final Logger logger = LoggerFactory.getLogger(StopDAO.class);
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public StopDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IStopDAO#addStop(com.avijit.
	 * busticketbooking.model.Stop)
	 */
	@Override
	public int addStop(Stop stop) {
		logger.info("addStop");
		Session session = sessionFactory.getCurrentSession();
		return (Integer) session.save(stop);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IStopDAO#getStop(int)
	 */
	@Override
	public Stop getStop(int stopID) {
		logger.info("getStop");
		Session session = sessionFactory.getCurrentSession();
		return (Stop) session.get(Stop.class, stopID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IStopDAO#updateStop(com.avijit.
	 * busticketbooking.model.Stop)
	 */
	@Override
	public boolean updateStop(Stop stop) {
		logger.info("updateStop");
		Session session = sessionFactory.getCurrentSession();
		Stop tempStop = (Stop) session.get(Stop.class, stop.getId());
		if (tempStop == null)
			return false;

		tempStop.setName(stop.getName());
		session.update(tempStop);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IStopDAO#deleteStop(int)
	 */
	@Override
	public boolean deleteStop(int stopID) {
		logger.info("deleteStop");
		Session session = sessionFactory.getCurrentSession();
		Stop stop = (Stop) session.get(Stop.class, stopID);
		if (stop == null)
			return false;

		session.delete(stop);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IStopDAO#getAllStops()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Stop> getAllStops() {
		logger.info("getAllStops");
		List<Stop> listStop = (List<Stop>) sessionFactory.getCurrentSession().createCriteria(Stop.class).list();
		return listStop;
	}

}
