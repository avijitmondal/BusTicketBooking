/**
 * 
 */
package com.avijit.busticketbooking.util;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author avijit
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class DateTimeTest {

	@Autowired
	DateTime dateTime;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.util.DateTime#toDate(java.lang.String)}.
	 */
	@Ignore
	@Test
	@SuppressWarnings("deprecation")
	public void testToDate() {
		String date = "23 January 2017";
		Date d = dateTime.toDate(date);
		System.out.println(d.toString());
		System.out.println(d.getDate());
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDay());
		assertNotEquals(null, d);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.util.DateTime#toTime(java.lang.String)}.
	 */
	@Ignore
	@Test
	@SuppressWarnings("deprecation")
	public void testToTime() {
		String time = "15:30:18";
		Time t = dateTime.toTime(time);
		System.out.println(t.getHours());
		System.out.println(t.getMinutes());
		System.out.println(t.getSeconds());
		assertNotEquals(null, t);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.util.DateTime#toDateTime(java.lang.String)}.
	 */
	@Ignore
	@Test
	public void testToDateTime() {
		String time = "15:30:18";
		String date = "23 January 2017";
		Date d = dateTime.toDateTime(dateTime.toDate(date), dateTime.toTime(time));
		System.out.println(d.toString());
		assertNotEquals(null, d);
	}

}
