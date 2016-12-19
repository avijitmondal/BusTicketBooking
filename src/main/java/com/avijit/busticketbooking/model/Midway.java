/**
 * 
 */
package com.avijit.busticketbooking.model;

/**
 * @author AVI
 *
 */
public class Midway {
	private int id;
	private int routeID;
	private int timeTableID;
	private int stopID;
	private String time;
	/**
	 * 
	 */
	public Midway() {
	}
	/**
	 * @param id
	 * @param routeID
	 * @param timeTableID
	 * @param stopID
	 * @param time
	 */
	public Midway(int id, int routeID, int timeTableID, int stopID, String time) {
		this.id = id;
		this.routeID = routeID;
		this.timeTableID = timeTableID;
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
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the routeID
	 */
	public int getRouteID() {
		return routeID;
	}
	/**
	 * @param routeID the routeID to set
	 */
	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}
	/**
	 * @return the timeTableID
	 */
	public int getTimeTableID() {
		return timeTableID;
	}
	/**
	 * @param timeTableID the timeTableID to set
	 */
	public void setTimeTableID(int timeTableID) {
		this.timeTableID = timeTableID;
	}
	/**
	 * @return the stopID
	 */
	public int getStopID() {
		return stopID;
	}
	/**
	 * @param stopID the stopID to set
	 */
	public void setStopID(int stopID) {
		this.stopID = stopID;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
}
