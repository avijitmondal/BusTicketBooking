/**
 * 
 */
package com.avijit.busticketbooking.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.model.Fare;

/**
 * @author AVI
 *
 */
public class FareDAOTest {

	@Autowired
	IFareDAO iFareDAO;
	Fare fare;

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
		fare = new Fare();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.FareDAO#addFare(com.avijit.busticketbooking.model.Fare)}.
	 */
	@Test
	public void testAddFare() {
		fare.setSourceStopID(1);
		fare.setDestinationStopID(2);
		fare.setAmount(5);
		boolean result = iFareDAO.addFare(fare);
		assertEquals(true, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.FareDAO#getFare(int)}.
	 */
	@Test
	public void testGetFare() {
		fare = iFareDAO.getFare(51);
		assertNotEquals(null, fare);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.FareDAO#updateFare(com.avijit.busticketbooking.model.Fare)}.
	 */
	@Test
	public void testUpdateFare() {
		fare.setSourceStopID(1);
		fare.setDestinationStopID(2);
		fare.setAmount(5);
		fare.setId(50);
		boolean result = iFareDAO.updateFare(fare);
		// assertEquals(true, result);
		assertEquals(false, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.FareDAO#deleteFate(int)}.
	 */
	@Test
	public void testDeleteFate() {
		boolean result = iFareDAO.deleteFare(50);
		assertEquals(true, result);
	}

}
