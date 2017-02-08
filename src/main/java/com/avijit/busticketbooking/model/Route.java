/**
 * 
 */
package com.avijit.busticketbooking.model;

import java.util.Collection;

/**
 * @author avijit
 *
 */
public class Route {
	private int id;
	private int origin;
	private int destination;
	private Collection<TimeTable> timeTable;

	/**
	 * 
	 */
	public Route() {
	}

	/**
	 * @param id
	 * @param origin
	 * @param destination
	 * @param timeTable
	 */
	public Route(int id, int origin, int destination, Collection<TimeTable> timeTable) {
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.timeTable = timeTable;
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
	 * @return the origin
	 */
	public int getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(int origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public int getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(int destination) {
		this.destination = destination;
	}

	/**
	 * @return the timeTable
	 */
	public Collection<TimeTable> getTimeTable() {
		return timeTable;
	}

	/**
	 * @param timeTable
	 *            the timeTable to set
	 */
	public void setTimeTable(Collection<TimeTable> timeTable) {
		this.timeTable = timeTable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ID : " + this.id + " ,Origin : " + this.origin + " ,Destination : " + this.destination;
	}
}
