/**
 * 
 */
package com.avijit.busticketbooking.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.avijit.busticketbooking.dao.IUserDAO;
import com.avijit.busticketbooking.model.User;

/**
 * @author AVI
 *
 */
public class UserService implements IUserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private IUserDAO iUserDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IUserService#addUser(com.avijit.
	 * busticketbooking.model.User)
	 */
	@Override
	public int addUser(User user) {
		int result = iUserDAO.addUser(user);
		if (result > 0)
			logger.info("addUser", "User " + user.getId() + " successfuly added");
		else
			logger.error("addBus", "Error adding " + user.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IUserService#getUser(int)
	 */
	@Override
	public User getUser(int userID) {
		User tempUser = iUserDAO.getUser(userID);
		if (tempUser != null)
			logger.info("getUser", "User " + userID + " details successfuly retrived");
		else
			logger.error("getUser", "Error retriving " + userID);
		return tempUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.avijit.busticketbooking.service.IUserService#updateUser(com.avijit.
	 * busticketbooking.model.User)
	 */
	@Override
	public boolean updateUser(User user) {
		boolean result = iUserDAO.updateUser(user);
		if (result)
			logger.info("updateUser", "User " + user.getId() + " successfuly updated");
		else
			logger.error("updateUser", "Error updating " + user.getId());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.service.IUserService#deleteUser(int)
	 */
	@Override
	public boolean deleteUser(int userID) {
		boolean result = iUserDAO.deleteUser(userID);
		if (result)
			logger.info("deleteUser", "User " + userID + " deleted successfuly");
		else
			logger.error("deleteUser", "Error deleting " + userID);
		return result;
	}

}
