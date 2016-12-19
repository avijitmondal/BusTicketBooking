/**
 * 
 */
package com.avijit.busticketbooking.model;

import java.util.List;

/**
 * @author avijit
 *
 */
public class Route {
	private int id;
	private String origin;
	private String destiny;
	private List<TimeTable> timeTable;
	/**
	 * 
	 */
	public Route() {
	}
	/**
	 * @param id
	 * @param origin
	 * @param destiny
	 * @param timeTable
	 */
	public Route(int id, String origin, String destiny, List<TimeTable> timeTable) {
		this.id = id;
		this.origin = origin;
		this.destiny = destiny;
		this.timeTable = timeTable;
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
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destiny
	 */
	public String getDestiny() {
		return destiny;
	}
	/**
	 * @param destiny the destiny to set
	 */
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}
	/**
	 * @return the timeTable
	 */
	public List<TimeTable> getTimeTable() {
		return timeTable;
	}
	/**
	 * @param timeTable the timeTable to set
	 */
	public void setTimeTable(List<TimeTable> timeTable) {
		this.timeTable = timeTable;
	}
}
