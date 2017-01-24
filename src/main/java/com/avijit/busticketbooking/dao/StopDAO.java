/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.avijit.busticketbooking.model.Stop;

/**
 * @author avijit
 *
 */
public class StopDAO implements IStopDAO {
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public StopDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/* (non-Javadoc)
	 * @see com.avijit.busticketbooking.dao.IStopDAO#addStop(com.avijit.busticketbooking.model.Stop)
	 */
	@Override
	public int addStop(Stop stop) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println(stop.getId()+stop.getName());
		return (Integer) session.save(stop);
	}

	/* (non-Javadoc)
	 * @see com.avijit.busticketbooking.dao.IStopDAO#getStop(int)
	 */
	@Override
	public Stop getStop(int stopID) {
		Session session = sessionFactory.getCurrentSession();
		return (Stop) session.get(Stop.class, stopID);
	}

	/* (non-Javadoc)
	 * @see com.avijit.busticketbooking.dao.IStopDAO#updateStop(com.avijit.busticketbooking.model.Stop)
	 */
	@Override
	public boolean updateStop(Stop stop) {
		Session session = sessionFactory.getCurrentSession();
		Stop tempStop = (Stop) session.get(Stop.class, stop.getId());
		if (tempStop == null)
			return false;
		
		tempStop.setName(stop.getName());
		session.update(tempStop);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.avijit.busticketbooking.dao.IStopDAO#deleteStop(int)
	 */
	@Override
	public boolean deleteStop(int stopID) {
		Session session = sessionFactory.getCurrentSession();
		Stop stop = (Stop) session.get(Stop.class, stopID);
		if (stop == null)
			return false;

		session.delete(stop);
		return true;
	}

}
