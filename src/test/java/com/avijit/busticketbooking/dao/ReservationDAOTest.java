/**
 * 
 */
package com.avijit.busticketbooking.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Timestamp;
import java.util.List;

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

import com.avijit.busticketbooking.model.Reservation;
import com.avijit.busticketbooking.util.Constants.ReservationTime;

/**
 * @author avijit
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class ReservationDAOTest {

	@Autowired
	private IReservationDAO iReservationDAO;
	private Reservation reservation;
	
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
		reservation =  new Reservation();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.avijit.busticketbooking.dao.ReservationDAO#addReservation(com.avijit.busticketbooking.model.Reservation)}.
	 */
	@Ignore
	@Test
	public void testAddReservation() {
		reservation.setMidwayID(1);
		reservation.setSeatID(31);
		reservation.setUserID(1);
		
		long now = System.currentTimeMillis();
		long nowPlus10Minutes = now + (10L * 60L * 1000L);
		Timestamp nowPlus10MinutesAsTimestamp = new Timestamp(nowPlus10Minutes);
		reservation.setTstamp(nowPlus10MinutesAsTimestamp);
		reservation.setFareID(2);
		
		int result = iReservationDAO.addReservation(reservation);
		assertNotEquals(-1, result);
	}

	/**
	 * Test method for {@link com.avijit.busticketbooking.dao.ReservationDAO#getReservation(int, int)}.
	 */
	@Ignore
	@Test
	public void testGetReservationIntInt() {
		reservation = iReservationDAO.getReservation(1, 3);
		System.out.println(reservation);
		assertNotNull(reservation);
	}

	/**
	 * Test method for {@link com.avijit.busticketbooking.dao.ReservationDAO#getReservation(int, com.avijit.busticketbooking.util.Constants.ReservationTime)}.
	 */
//	@Ignore
	@Test
	public void testGetReservationIntReservationTime() {
		List<Reservation> reservation = iReservationDAO.getReservation(1, ReservationTime.PAST_RESERVATION);
		assertNotNull(reservation);
	}

	/**
	 * Test method for {@link com.avijit.busticketbooking.dao.ReservationDAO#updateReservation(com.avijit.busticketbooking.model.Reservation)}.
	 */
	@Ignore
	@Test
	public void testUpdateReservation() {
		reservation.setId(4);
		reservation.setMidwayID(1);
		reservation.setSeatID(31);
		reservation.setUserID(1);
		
		long now = System.currentTimeMillis();
		long nowPlus10Minutes = now + (10L * 60L * 1000L);
		Timestamp nowMinus5MinutesAsTimestamp = new Timestamp(nowPlus10Minutes);
		reservation.setTstamp(nowMinus5MinutesAsTimestamp);
		reservation.setFareID(2);
		
		boolean result = iReservationDAO.updateReservation(reservation);
		assertNotEquals(false, result);
	}

	/**
	 * Test method for {@link com.avijit.busticketbooking.dao.ReservationDAO#deleteReservation(int)}.
	 */
	@Ignore
	@Test
	public void testDeleteReservation() {
		boolean result = iReservationDAO.deleteReservation(3);
		assertEquals(true, result);
	}

}
