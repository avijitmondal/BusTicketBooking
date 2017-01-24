/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.avijit.busticketbooking.model.Fare;

/**
 * @author avijit
 *
 */
public class FareDAO implements IFareDAO {
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public FareDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IFareDAO#addFare(com.avijit.
	 * busticketbooking.model.Fare)
	 */
	@Override
	public int addFare(Fare fare) {
		Session session = sessionFactory.getCurrentSession();
		return (Integer) session.save(fare);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IFareDAO#getFare(int)
	 */
	@Override
	public Fare getFare(int fareID) {
		Session session = sessionFactory.getCurrentSession();
		return (Fare) session.get(Fare.class, fareID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IFareDAO#updateFare(com.avijit.
	 * busticketbooking.model.Fare)
	 */
	@Override
	public boolean updateFare(Fare fare) {
		Session session = sessionFactory.getCurrentSession();
		Fare tempFare = (Fare) session.get(Fare.class, fare.getId());
		if (tempFare == null)
			return false;

		tempFare.setSourceStopID(fare.getSourceStopID());
		tempFare.setDestinationStopID(fare.getDestinationStopID());
		tempFare.setAmount(fare.getAmount());
		session.update(tempFare);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IFareDAO#deleteFare(int)
	 */
	@Override
	public boolean deleteFare(int fareID) {
		Session session = sessionFactory.getCurrentSession();
		Fare fare = (Fare) session.get(Fare.class, fareID);
		if (fare == null)
			return false;

		session.delete(fare);
		return true;
	}
}
