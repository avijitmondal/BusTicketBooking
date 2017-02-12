/**
 * 
 */
package com.avijit.busticketbooking.model;

/**
 * @author avijit
 *
 */
public class Bus {
	private int id;
	private String busNumber;
	private int capacity;

	/**
	 * 
	 */
	public Bus() {
	}

	/**
	 * @param id
	 * @param ac
	 * @param capacity
	 */
	public Bus(int id, String busNumber, int capacity) {
		this.id = id;
		this.busNumber = busNumber;
		this.capacity = capacity;
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
	 * @return the busNumber
	 */
	public String getBusNumber() {
		return busNumber;
	}

	/**
	 * @param busNumber
	 *            the busNumber to set
	 */
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Id : " + this.id + " , Bus Number : " + this.busNumber + " , Available : " + this.capacity;
	}

}