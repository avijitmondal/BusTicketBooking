/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avijit.busticketbooking.model.Reservation;
import com.avijit.busticketbooking.util.Constants.ReservationTime;

/**
 * @author avijit
 *
 */
public class ReservationDAO implements IReservationDAO {
	private static final Logger logger = LoggerFactory.getLogger(ReservationDAO.class);
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public ReservationDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.dao.IReservationDAO#addReservation(com.avijit
	 * .busticketbooking.model.Reservation)
	 */
	@Override
	public int addReservation(Reservation reservation) {
		logger.info("addReservation");
		Session session = sessionFactory.getCurrentSession();
		return (Integer) session.save(reservation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IReservationDAO#getReservation(int,
	 * int)
	 */
	@Override
	public Reservation getReservation(int userID, int reservationID) {
		logger.info("getReservation");
		Session session = sessionFactory.getCurrentSession();
		return (Reservation) session.createCriteria(Reservation.class).add(Restrictions.eq("userID", userID))
				.add(Restrictions.eq("id", reservationID)).list().get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IReservationDAO#getReservation(int,
	 * com.avijit.busticketbooking.util.Constants.ReservationTime)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Reservation> getReservation(int userID, ReservationTime pastOrFuture) {
		logger.info("getReservation");
		List<Reservation> listReservation = null;
		if (pastOrFuture == ReservationTime.PAST_RESERVATION) {
			listReservation = (List<Reservation>) sessionFactory.getCurrentSession().createCriteria(Reservation.class)
					.add(Restrictions.lt("tstamp", new Timestamp(System.currentTimeMillis()))).list();
		} else {
			listReservation = (List<Reservation>) sessionFactory.getCurrentSession().createCriteria(Reservation.class)
					.add(Restrictions.gt("tstamp", new Timestamp(System.currentTimeMillis()))).list();
		}
		return listReservation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.dao.IReservationDAO#updateReservation(com.
	 * avijit.busticketbooking.model.Reservation)
	 */
	@Override
	public boolean updateReservation(Reservation reservation) {
		logger.info("updateReservation");
		Session session = sessionFactory.getCurrentSession();
		Reservation tempReservation = (Reservation) session.get(Reservation.class, reservation.getId());
		if (tempReservation == null)
			return false;

		tempReservation.setMidwayID(reservation.getMidwayID());
		tempReservation.setSeatID(reservation.getSeatID());
		tempReservation.setUserID(reservation.getUserID());
		tempReservation.setFareID(reservation.getFareID());
		tempReservation.setTstamp(reservation.getTstamp());
		session.update(tempReservation);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.dao.IReservationDAO#deleteReservation(int)
	 */
	@Override
	public boolean deleteReservation(int reservationID) {
		logger.info("deleteReservation");
		Session session = sessionFactory.getCurrentSession();
		Reservation reservation = (Reservation) session.get(Reservation.class, reservationID);
		if (reservation == null)
			return false;

		session.delete(reservation);
		return true;
	}

}
