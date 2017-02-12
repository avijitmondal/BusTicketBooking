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

import com.avijit.busticketbooking.model.User;

/**
 * @author AVI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class UserDAOTest {

	@Autowired
	private IUserDAO iUserDAO;
	private User user;

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
		user = new User();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.UserDAO#addUser(com.avijit.busticketbooking.model.User)}.
	 */
	@Ignore
	@Test
	public void testAddUser() {
		user.setUsername("sidhu");
		user.setName("Avijit Mondal");
		user.setEmail("avijit.mondal@rebaca.com");
		user.setPassword("admin");
		user.setSex('M');
		user.setMobile("9564951393");
		int result = iUserDAO.addUser(user);
		assertNotEquals(-1, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.UserDAO#getUser(int)}.
	 */
	@Ignore
	@Test
	public void testGetUser() {
		user = iUserDAO.getUser(1);
		assertNotEquals(null, user);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.UserDAO#updateUser(com.avijit.busticketbooking.model.User)}.
	 */
	@Ignore
	@Test
	public void testUpdateUser() {
		user.setName("Admin");
		user.setId(3);
		boolean result = iUserDAO.updateUser(user);
		assertEquals(true, result);
	}

	/**
	 * Test method for
	 * {@link com.avijit.busticketbooking.dao.UserDAO#deleteUser(int)}.
	 */
	@Ignore
	@Test
	public void testDeleteUser() {
		boolean result = iUserDAO.deleteUser(3);
		assertEquals(true, result);
	}

}
