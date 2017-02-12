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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.avijit.busticketbooking.model.Fare;

/**
 * @author AVI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class FareDAOTest {

	@Autowired
	private IFareDAO iFareDAO;
	private Fare fare;

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
	@Ignore
	@Test
	public void testAddFare() {
		fare.setSourceStopID(1);
		fare.setDestinationStopID(2);
		fare.setAmount(5);
		int result = iFareDAO.addFare(fare);
		assertNotEquals(-1, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.FareDAO#getFare(int)}.
	 */
	@Ignore
	@Test
	public void testGetFare() {
		fare = iFareDAO.getFare(51);
		assertEquals(null, fare);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.FareDAO#updateFare(com.avijit.busticketbooking.model.Fare)}.
	 */
	@Ignore
	@Test
	public void testUpdateFare() {
		fare.setSourceStopID(1);
		fare.setDestinationStopID(2);
		fare.setAmount(10);
		fare.setId(20);
		boolean result = iFareDAO.updateFare(fare);
		assertEquals(true, result);
		//assertEquals(false, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.FareDAO#deleteFate(int)}.
	 */
	@Ignore
	@Test
	public void testDeleteFate() {
		boolean result = iFareDAO.deleteFare(50);
		assertEquals(true, result);
	}

}
