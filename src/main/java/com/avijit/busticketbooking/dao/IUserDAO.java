/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.User;

/**
 * Access User table data
 * 
 * @author avijit
 *
 */
public interface IUserDAO {

	/**
	 * Add a new user
	 * 
	 * @param user
	 * @return int
	 */
	@Transactional
	public int addUser(User user);

	/**
	 * Get a user details
	 * 
	 * @param userID
	 * @return User
	 */
	@Transactional
	public User getUser(int userID);

	/**
	 * Update a user details
	 * 
	 * @param user
	 * @return boolean
	 */
	@Transactional
	public boolean updateUser(User user);

	/**
	 * Delete a user
	 * 
	 * @param userID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteUser(int userID);
}
