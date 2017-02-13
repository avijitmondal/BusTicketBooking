/**
 * 
 */
package com.avijit.busticketbooking.dao;

import static org.junit.Assert.assertNotEquals;

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

import com.avijit.busticketbooking.model.Route;

/**
 * @author AVI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class RouteDAOTest {

	@Autowired
	private IRouteDAO iRouteDAO;

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
	 * {@link com.avijit.busticketbooking.dao.RouteDAO#findRoutesByOrigin(java.lang.String)}.
	 */
	@Ignore
	@Test
	public void testFindRoutesByOrigin() {
		List<Route> listRoutes = iRouteDAO.findRoutesByOrigin(1);
		assertNotEquals(null, listRoutes);
		for (Route r : listRoutes)
			System.out.println(r);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.RouteDAO#findRoutesByDestination(java.lang.String)}.
	 */
	@Ignore
	@Test
	public void testFindRoutesByDestination() {
		List<Route> listRoutes = iRouteDAO.findRoutesByDestination(1);
		assertNotEquals(null, listRoutes);
		for (Route r : listRoutes)
			System.out.println(r);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.RouteDAO#findRouteByOriginAndDestination(java.lang.String, java.lang.String)}.
	 */
	@Ignore
	@Test
	public void testFindRoutesByOriginAndDestination() {
		List<Route> listRoutes = iRouteDAO.findRoutesByOriginAndDestination(1, 2);
		assertNotEquals(null, listRoutes);
		for (Route r : listRoutes)
			System.out.println(r);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.RouteDAO#findAllRoutes()}.
	 */
	@Ignore
	@Test
	public void testFindAllRoutes() {
		List<Route> list = iRouteDAO.findAllRoutes();
		assertNotEquals(null, list);
		for (Route r : list) {
			System.out.println(r);
		}
	}

}
