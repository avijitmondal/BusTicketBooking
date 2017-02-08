/**
 * 
 */
package com.avijit.busticketbooking.model;

import java.util.Date;

/**
 * @author avijit
 *
 */
public class Midway {
	private int id;
	private int stopID;
	private Date time;

	/**
	 * 
	 */
	public Midway() {
	}

	/**
	 * @param id
	 * @param stopID
	 * @param time
	 */
	public Midway(int id, int stopID, Date time) {
		this.id = id;
		this.stopID = stopID;
		this.time = time;
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
	 * @return the stopID
	 */
	public int getStopID() {
		return stopID;
	}

	/**
	 * @param stopID
	 *            the stopID to set
	 */
	public void setStopID(int stopID) {
		this.stopID = stopID;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ID : " + this.id + " ,StopID : " + this.stopID + " ,Time : " + this.time;
	}
}
