/**
 * 
 */
package com.avijit.busticketbooking.service;

import java.util.List;

import com.avijit.busticketbooking.model.Reservation;
import com.avijit.busticketbooking.util.Constants.ReservationTime;

/**
 * @author AVI
 *
 */
public interface IReservationService {

	/**
	 * Add a new Reservation
	 * 
	 * @param reservation
	 * @return int
	 */
	public int addReservation(Reservation reservation);

	/**
	 * Get a reservation details
	 * 
	 * @param userID
	 * @param reservationID
	 * @return Reservation
	 */
	public Reservation getReservation(int userID, int reservationID);

	/**
	 * Get list of reservations either past or future
	 * 
	 * @param userID
	 * @param pastOrFuture
	 * @return List of Reservation
	 */
	public List<Reservation> getReservation(int userID, ReservationTime pastOrFuture);

	/**
	 * Update a reservation details
	 * 
	 * @param reservation
	 * @return boolean
	 */
	public boolean updateReservation(Reservation reservation);

	/**
	 * Delete a reservation details
	 * 
	 * @param reservationID
	 * @return boolean
	 */
	public boolean deleteReservation(int reservationID);
}
