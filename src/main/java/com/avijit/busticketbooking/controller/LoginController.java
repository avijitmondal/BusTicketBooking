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
public class LoginController implements IController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	IUserDAO iUserDAO;

	/**
	 * Check a user is valid or not
	 * 
	 * @param userID
	 * @param password
	 * @return is valid user or not
	 */
	public boolean isValidUser(int userID, String password) {
		User user = iUserDAO.getUser(userID);
		if (user.getPassword().equalsIgnoreCase(password)) {
			logger.info("Password matched");
			return true;
		}
		logger.error("Password mismatched");
		return false;
	}
}
