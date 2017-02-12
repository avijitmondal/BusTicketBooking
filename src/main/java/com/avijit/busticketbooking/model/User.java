/**
 * 
 */
package com.avijit.busticketbooking.model;

/**
 * @author avijit
 *
 */
public class User {
	private int id;
	private String username;
	private String password;
	private String name;
	private char sex;
	private String email;
	private String mobile;

	/**
	 * 
	 */
	public User() {
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param name
	 * @param sex
	 * @param email
	 * @param mobile
	 */
	public User(int id, String username, String password, String name, char sex, String email, String mobile) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.mobile = mobile;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Id : " + this.id + " ,Username : " + this.username + " ,Password : " + this.password + " ,Name : "
				+ this.name + " ,Sex : " + this.sex + " ,Email : " + this.email + " ,Mobile : " + this.mobile;
	}
}
