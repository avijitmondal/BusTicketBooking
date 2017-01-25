/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.springframework.transaction.annotation.Transactional;

import com.avijit.busticketbooking.model.User;

/**
 * @author avijit
 *
 */
public interface IUserDAO {
	
	/**
	 * 
	 * @param user
	 * @return int
	 */
	@Transactional
	public int addUser(User user);
	
	/**
	 * 
	 * @param userID
	 * @return User
	 */
	@Transactional
	public User getUser(int userID);
	
	/**
	 * 
	 * @param user
	 * @return boolean
	 */
	@Transactional
	public boolean updateUser(User user);
	
	/**
	 * 
	 * @param userID
	 * @return boolean
	 */
	@Transactional
	public boolean deleteUser(int userID);
}
