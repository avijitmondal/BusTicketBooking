/**
 * 
 */
package com.avijit.busticketbooking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avijit.busticketbooking.model.User;

/**
 * Access User table data
 * 
 * @author avijit
 *
 */
public class UserDAO implements IUserDAO {
	private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public UserDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IUserDAO#addUser(com.avijit.
	 * busticketbooking.model.User)
	 */
	@Override
	public int addUser(User user) {
		logger.info("addUser");
		Session session = sessionFactory.getCurrentSession();
		return (Integer) session.save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IUserDAO#getUser(int)
	 */
	@Override
	public User getUser(int userID) {
		logger.info("getUser");
		Session session = sessionFactory.getCurrentSession();
		return (User) session.get(User.class, userID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IUserDAO#updateUser(com.avijit.
	 * busticketbooking.model.User)
	 */
	@Override
	public boolean updateUser(User user) {
		logger.info("updateUser");
		Session session = sessionFactory.getCurrentSession();
		User tempUser = (User) session.get(User.class, user.getId());
		if (tempUser == null)
			return false;

		tempUser.setName(user.getName());
		tempUser.setEmail(user.getEmail());
		tempUser.setMobile(user.getMobile());
		tempUser.setPassword(user.getPassword());
		tempUser.setSex(user.getSex());
		tempUser.setUsername(user.getUsername());
		session.update(tempUser);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.avijit.busticketbooking.dao.IUserDAO#deleteUser(int)
	 */
	@Override
	public boolean deleteUser(int userID) {
		logger.info("deleteUser");
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, userID);
		if (user == null)
			return false;

		session.delete(user);
		return true;
	}

}
