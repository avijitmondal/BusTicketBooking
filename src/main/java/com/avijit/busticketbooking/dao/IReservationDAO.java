/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Reservation;
import com.avijit.busticketbooking.util.Constants.ReservationTime;

/**
 * @author avijit
 *
 */
public interface IReservationDAO {
	
	/**
	 * 
	 * @param reservation
	 * @return int
	 */
	@Transactional
	public int addReservation(Reservation reservation);

	/**
	 * 
	 * @param userID
	 * @param reservationID
	 * @return Reservation
	 */
	@Transactional
	public Reservation getReservation(int userID, int reservationID);

	/**
	 * 
	 * @param userID
	 * @param pastOrFuture
	 * @return List of Reservation
	 */
	@Transactional
	public List<Reservation> getReservation(int userID, ReservationTime pastOrFuture);

	/**
	 * 
	 * @param reservation
	 * @return boolean
	 */
	@Transactional
	public boolean updateReservation(Reservation reservation);

	/**
	 * 
	 * @param reservationID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteReservation(int reservationID);
}
