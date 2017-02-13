/**
 * 
 */
package com.avijit.busticketbooking.service;

import com.avijit.busticketbooking.model.User;

/**
 * @author AVI
 *
 */
public interface IUserService {

	/**
	 * Add a new user
	 * 
	 * @param user
	 * @return int
	 */
	public int addUser(User user);

	/**
	 * Get a user details
	 * 
	 * @param userID
	 * @return User
	 */
	public User getUser(int userID);

	/**
	 * Update a user details
	 * 
	 * @param user
	 * @return boolean
	 */
	public boolean updateUser(User user);

	/**
	 * Delete a user
	 * 
	 * @param userID
	 * @return boolean
	 */
	public boolean deleteUser(int userID);
}
