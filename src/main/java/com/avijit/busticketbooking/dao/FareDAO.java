/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avijit.busticketbooking.model.Fare;

/**
 * Access Fare table data
 * 
 * @author avijit
 *
 */
public class FareDAO implements IFareDAO {
	private static final Logger logger = LoggerFactory.getLogger(FareDAO.class);
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
		logger.info("addFare");
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
		logger.info("getFare");
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
		logger.info("updateFare");
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
		logger.info("deleteFare");
		Session session = sessionFactory.getCurrentSession();
		Fare fare = (Fare) session.get(Fare.class, fareID);
		if (fare == null)
			return false;

		session.delete(fare);
		return true;
	}
}
