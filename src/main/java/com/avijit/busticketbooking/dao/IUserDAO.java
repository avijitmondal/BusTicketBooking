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
	 * @return
	 */
	@Transactional
	public boolean addUser(User user);
	
	/**
	 * 
	 * @param userID
	 * @return
	 */
	@Transactional
	public User getUser(int userID);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	@Transactional
	public boolean updateUser(User user);
	
	/**
	 * 
	 * @param userID
	 * @return
	 */
	@Transactional
	public boolean deleteUser(int userID);
}
