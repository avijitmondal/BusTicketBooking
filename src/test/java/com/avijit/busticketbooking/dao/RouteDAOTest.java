/**
 * 
 */
package com.avijit.busticketbooking.dao;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
	IRouteDAO iRouteDAO;
	Route route;

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
		route = new Route();
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
	@Test
	public void testFindRoutesByOrigin() {
		System.out.println("testFindRoutesByOrigin");
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.RouteDAO#findRoutesByDestination(java.lang.String)}.
	 */
	@Test
	public void testFindRoutesByDestination() {
		System.out.println("testFindRoutesByDestination");
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.RouteDAO#findRouteByOriginAndDestination(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testFindRouteByOriginAndDestination() {
		System.out.println("testFindRouteByOriginAndDestination");
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.RouteDAO#findAllRoutes()}.
	 */
	@Test
	public void testFindAllRoutes() {
		List<Route> list = iRouteDAO.findAllRoutes();
		for (Route r : list) {
			System.out.println(r);	
		}
	}

}
