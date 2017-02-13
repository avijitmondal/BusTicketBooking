/**
 * 
 */
package com.avijit.busticketbooking.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.dao.IReservationDAO;
import com.avijit.busticketbooking.model.Reservation;
import com.avijit.busticketbooking.util.Constants.ReservationTime;

/**
 * @author AVI
 *
 */
public class ReservationService implements IReservationService {

	private static final Logger logger = LoggerFactory.getLogger(ReservationService.class);

	@Autowired
	private IReservationDAO iReservationDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IReservationService#addReservation(
	 * com.avijit.busticketbooking.model.Reservation)
	 */
	@Override
	public int addReservation(Reservation reservation) {
		int result = iReservationDAO.addReservation(reservation);
		if (result > 0)
			logger.info("addReservation", "Reservation " + reservation.getId() + " successfuly added");
		else
			logger.error("addReservation", "Error adding " + reservation.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IReservationService#getReservation(
	 * int, int)
	 */
	@Override
	public Reservation getReservation(int userID, int reservationID) {
		Reservation tempReservation = iReservationDAO.getReservation(userID, reservationID);
		if (tempReservation != null)
			logger.info("getReservation", "Reservation " + reservationID + " details successfuly retrived");
		else
			logger.error("getReservation", "Error retriving " + reservationID);
		return tempReservation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IReservationService#getReservation(
	 * int, com.avijit.busticketbooking.util.Constants.ReservationTime)
	 */
	@Override
	public List<Reservation> getReservation(int userID, ReservationTime pastOrFuture) {
		List<Reservation> listReservations = iReservationDAO.getReservation(userID, pastOrFuture);
		if (listReservations != null)
			logger.info("getReservation", "Reservations for " + userID + " successfuly retrived");
		else
			logger.error("getReservation", "Error retriving " + userID);
		return listReservations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IReservationService#updateReservation
	 * (com.avijit.busticketbooking.model.Reservation)
	 */
	@Override
	public boolean updateReservation(Reservation reservation) {
		boolean result = iReservationDAO.updateReservation(reservation);
		if (result)
			logger.info("updateReservation", "Reservation " + reservation.getId() + " successfuly updated");
		else
			logger.error("updateReservation", "Error updating " + reservation.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IReservationService#deleteReservation
	 * (int)
	 */
	@Override
	public boolean deleteReservation(int reservationID) {
		boolean result = iReservationDAO.deleteReservation(reservationID);
		if (result)
			logger.info("deleteReservation", "Reservation " + reservationID + " deleted successfuly");
		else
			logger.error("deleteReservation", "Error deleting " + reservationID);
		return result;
	}

}
