/**
 * 
 */
package com.avijit.busticketbooking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.dao.IUserDAO;
import com.avijit.busticketbooking.model.User;

/**
 * @author AVI
 *
 */
public class RegistrationController implements IController {

	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	IUserDAO iUserDAO;

	/**
	 * Check a user is exists or not
	 * 
	 * @param userID
	 * @return is valid user or not
	 */
	public boolean isUserExist(int userID) {
		User user = iUserDAO.getUser(userID);
		if (user != null) {
			logger.info("User exist");
			return true;
		}
		logger.error("User does not exist");
		return false;
	}

	/**
	 * Register a new user
	 * 
	 * @param user
	 * @return userID
	 */
	public boolean registrationUser(User user) {
		int userID = iUserDAO.addUser(user);
		if (userID >= 0) {
			logger.info("User added successfully");
			return true;
		}
		logger.error("User registration error");
		return false;
	}
}
