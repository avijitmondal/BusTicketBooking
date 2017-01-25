/**
 * 
 */
package com.avijit.busticketbooking.dao;

import static org.junit.Assert.*;

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

import com.avijit.busticketbooking.model.Stop;

/**
 * @author AVI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class StopDAOTest {
	
	@Autowired
	IStopDAO iStopDAO;
	Stop stop;

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
		stop = new Stop();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.StopDAO#addStop(com.avijit.busticketbooking.model.Stop)}.
	 */
	@Ignore
	@Test
	public void testAddStop() {
		stop.setName("Dhanbad");
		int result = iStopDAO.addStop(stop);
		assertNotEquals(-1, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.StopDAO#getStop(int)}.
	 */
	@Ignore
	@Test
	public void testGetStop() {
		stop = iStopDAO.getStop(51);
		assertNotEquals(null, stop);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.StopDAO#updateStop(com.avijit.busticketbooking.model.Stop)}.
	 */
	@Ignore
	@Test
	public void testUpdateStop() {
		stop.setName("Asansol");
		stop.setId(20);
		boolean result = iStopDAO.updateStop(stop);
		assertEquals(true, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.StopDAO#deleteStop(int)}.
	 */
	@Ignore
	@Test
	public void testDeleteStop() {
		boolean result = iStopDAO.deleteStop(69);
		assertEquals(true, result);
	}

}
