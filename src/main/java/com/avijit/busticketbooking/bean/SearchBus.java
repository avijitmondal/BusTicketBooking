/**
 * 
 */
package com.avijit.busticketbooking.bean;

/**
 * @author avijit
 *
 */
public class SearchBus {
	private String source;
	private String destination;
	private String date;
	private String fromTime;
	private String toTime;

	/**
	 * 
	 */
	public SearchBus() {
	}

	/**
	 * @param source
	 * @param destination
	 * @param date
	 * @param fromTime
	 * @param toTIme
	 */
	public SearchBus(String source, String destination, String date, String fromTime, String toTime) {
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.fromTime = fromTime;
		this.toTime = toTime;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the fromTime
	 */
	public String getFromTime() {
		return fromTime;
	}

	/**
	 * @param fromTime
	 *            the fromTime to set
	 */
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	/**
	 * @return the toTime
	 */
	public String getToTime() {
		return toTime;
	}

	/**
	 * @param toTime
	 *            the toTime to set
	 */
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Source : " + this.source + " ,Destination : " + this.destination + " ,Date : " + this.date
				+ " ,FromTime : " + this.fromTime + " ,ToTime : " + this.toTime;
	}
}
