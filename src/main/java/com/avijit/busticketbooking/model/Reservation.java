/**
 * 
 */
package com.avijit.busticketbooking.model;

import java.util.Date;

/**
 * @author avijit
 *
 */
public class Reservation {
	private int id;
	private int midwayID;
	private int userID;
	private int seatID;
	private int fareID;
	private Date tstamp;

	/**
	 * 
	 */
	public Reservation() {
	}

	/**
	 * @param id
	 * @param midwayID
	 * @param userID
	 * @param seatID
	 * @param fareID
	 * @param tstamp
	 */
	public Reservation(int id, int midwayID, int userID, int seatID, int fareID, Date tstamp) {
		this.id = id;
		this.midwayID = midwayID;
		this.userID = userID;
		this.seatID = seatID;
		this.fareID = fareID;
		this.tstamp = tstamp;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the midwayID
	 */
	public int getMidwayID() {
		return midwayID;
	}

	/**
	 * @param midwayID
	 *            the midwayID to set
	 */
	public void setMidwayID(int midwayID) {
		this.midwayID = midwayID;
	}

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID
	 *            the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * @return the seatID
	 */
	public int getSeatID() {
		return seatID;
	}

	/**
	 * @param seatID
	 *            the seatID to set
	 */
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}

	/**
	 * @return the fareID
	 */
	public int getFareID() {
		return fareID;
	}

	/**
	 * @param fareID
	 *            the fare to set
	 */
	public void setFareID(int fareID) {
		this.fareID = fareID;
	}

	/**
	 * @return the tstamp
	 */
	public Date getTstamp() {
		return tstamp;
	}

	/**
	 * @param tstamp
	 *            the tstamp to set
	 */
	public void setTstamp(Date tstamp) {
		this.tstamp = tstamp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ID : " + this.id + " ,MidwayID : " + this.midwayID + " ,UserID : " + this.seatID + " ,FareID : "
				+ this.fareID + " ,TStamp : " + this.tstamp;
	}
}
