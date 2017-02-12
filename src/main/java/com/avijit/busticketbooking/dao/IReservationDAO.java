/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.Reservation;
import com.avijit.busticketbooking.util.Constants.ReservationTime;

/**
 * Access Reservation table data
 * 
 * @author avijit
 *
 */
public interface IReservationDAO {

	/**
	 * Add a new Reservation
	 * 
	 * @param reservation
	 * @return int
	 */
	@Transactional
	public int addReservation(Reservation reservation);

	/**
	 * Get a reservation details
	 * 
	 * @param userID
	 * @param reservationID
	 * @return Reservation
	 */
	@Transactional
	public Reservation getReservation(int userID, int reservationID);

	/**
	 * Get list of reservations either past or future
	 * 
	 * @param userID
	 * @param pastOrFuture
	 * @return List of Reservation
	 */
	@Transactional
	public List<Reservation> getReservation(int userID, ReservationTime pastOrFuture);

	/**
	 * Update a reservation details
	 * 
	 * @param reservation
	 * @return boolean
	 */
	@Transactional
	public boolean updateReservation(Reservation reservation);

	/**
	 * Delete a reservation details
	 * 
	 * @param reservationID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteReservation(int reservationID);
}
