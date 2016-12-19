/**
 * 
 */
package com.avijit.busticketbooking.model;

import java.util.Date;
import java.util.List;

/**
 * @author AVI
 *
 */
public class TimeTable {
	private int id;
	private int routeID;
	private Date departureTime;
	private Date arrivalTime;
	private int available;
	private int busID;
	private List<Midway> midway;
	/**
	 * 
	 */
	public TimeTable() {
	}
	/**
	 * @param id
	 * @param routeID
	 * @param departureTime
	 * @param arrivalTime
	 * @param available
	 * @param busID
	 * @param midway
	 */
	public TimeTable(int id, int routeID, Date departureTime, Date arrivalTime, int available, int busID,
			List<Midway> midway) {
		this.id = id;
		this.routeID = routeID;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.available = available;
		this.busID = busID;
		this.midway = midway;
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
	 * @return the departureTime
	 */
	public Date getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the arrivalTime
	 */
	public Date getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * @return the available
	 */
	public int getAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(int available) {
		this.available = available;
	}
	/**
	 * @return the busID
	 */
	public int getBusID() {
		return busID;
	}
	/**
	 * @param busID the busID to set
	 */
	public void setBusID(int busID) {
		this.busID = busID;
	}
	/**
	 * @return the midway
	 */
	public List<Midway> getMidway() {
		return midway;
	}
	/**
	 * @param midway the midway to set
	 */
	public void setMidway(List<Midway> midway) {
		this.midway = midway;
	}
}
