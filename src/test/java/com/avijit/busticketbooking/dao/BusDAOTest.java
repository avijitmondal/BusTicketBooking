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

import com.avijit.busticketbooking.model.Bus;

/**
 * @author AVI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class BusDAOTest {

	@Autowired
	IBusDAO iBusDAO;
	Bus bus;

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
		bus = new Bus();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.BusDAO#addBus(com.avijit.busticketbooking.model.Bus)}.
	 */
	@Ignore
	@Test
	public void testAddBus() {
		bus.setCapacity(50);
		int result = iBusDAO.addBus(bus);
		assertNotEquals(-1, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.BusDAO#getBus(int)}.
	 */
	@Ignore
	@Test
	public void testGetBus() {
		bus = iBusDAO.getBus(51);
		assertNotEquals(null, bus);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.BusDAO#updateBus(com.avijit.busticketbooking.model.Bus)}.
	 */
	@Ignore
	@Test
	public void testUpdateBus() {
		bus.setBusNumber("WB 01 1 1111");
		bus.setCapacity(36);
		bus.setId(50);
		boolean result = iBusDAO.updateBus(bus);
		// assertEquals(true, result);
		assertEquals(false, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.BusDAO#deleteBus(int)}.
	 */
	@Ignore
	@Test
	public void testDeleteBus() {
		boolean result = iBusDAO.deleteBus(50);
		assertEquals(true, result);
	}

}
