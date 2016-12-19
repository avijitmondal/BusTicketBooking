/**
 * 
 */
package com.avijit.busticketbooking.model;

/**
 * @author AVI
 *
 */
public class Fare {
	private int id;
	private int destinationStopID;
	private int sourceStopID;
	private int amount;
	/**
	 * 
	 */
	public Fare() {
	}
	/**
	 * @param id
	 * @param destinationStopID
	 * @param sourceStopID
	 * @param amount
	 */
	public Fare(int id, int destinationStopID, int sourceStopID, int amount) {
		this.id = id;
		this.destinationStopID = destinationStopID;
		this.sourceStopID = sourceStopID;
		this.amount = amount;
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
	 * @return the destinationStopID
	 */
	public int getDestinationStopID() {
		return destinationStopID;
	}
	/**
	 * @param destinationStopID the destinationStopID to set
	 */
	public void setDestinationStopID(int destinationStopID) {
		this.destinationStopID = destinationStopID;
	}
	/**
	 * @return the sourceStopID
	 */
	public int getSourceStopID() {
		return sourceStopID;
	}
	/**
	 * @param sourceStopID the sourceStopID to set
	 */
	public void setSourceStopID(int sourceStopID) {
		this.sourceStopID = sourceStopID;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
