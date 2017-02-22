/**
 * 
 */
package com.avijit.busticketbooking.util;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author avijit
 *
 */
public class DateTime {

	private static final Logger logger = LoggerFactory.getLogger(DateTime.class);

	public Date toDate(String date) {
		DateFormat format = new SimpleDateFormat("dd MMM yyyy");
		try {
			Date d = format.parse(date);
			return d;
		} catch (ParseException e) {
			e.printStackTrace();
			logger.error("getDate", "error parsing string to date", e.getMessage());
			return null;
		}
	}

	public Time toTime(String time) {
		return Time.valueOf(time);
	}

	@SuppressWarnings("deprecation")
	public Date toDateTime(Date date, Time time) {
		date.setHours(time.getHours());
		date.setMinutes(time.getMinutes());
		date.setSeconds(time.getSeconds());
		return date;
	}
}
