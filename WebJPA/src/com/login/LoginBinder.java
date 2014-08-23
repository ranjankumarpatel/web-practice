package com.login;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class LoginBinder implements HttpSessionBindingListener,HttpSessionListener
		 {
	
	private String username;
	private boolean alreadyLoggedIn;
	
	
	public static Map<LoginBinder, HttpSession> logins = new HashMap<LoginBinder, HttpSession>();

	public LoginBinder() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void valueBound(HttpSessionBindingEvent event) {		
		HttpSession session = logins.get(this);
		if (session != null) {
			setAlreadyLoggedIn(true);
		}
		logins.put(this, event.getSession());
		System.out.println(logins);

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {			
		//logins.remove(this);
		HttpSession session = logins.get(this);
		if (session != null) {
			setAlreadyLoggedIn(true);
		}else{
			logins.remove(this);
		}
		
		System.out.println(logins);
		

	}



	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof LoginBinder)) {
			return false;
		}
		LoginBinder other = (LoginBinder) obj;
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!username.equals(other.username)) {
			return false;
		}
		return true;
	}



	/**
	 * @return the alreadyLoggedIn
	 */
	public boolean isAlreadyLoggedIn() {
		return alreadyLoggedIn;
	}



	/**
	 * @param alreadyLoggedIn the alreadyLoggedIn to set
	 */
	public void setAlreadyLoggedIn(boolean alreadyLoggedIn) {
		this.alreadyLoggedIn = alreadyLoggedIn;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginBinder [username=" + username + ", alreadyLoggedIn="
				+ alreadyLoggedIn + "]";
	}



	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().setMaxInactiveInterval(1);
		
	}



	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		LoginBinder loginBinder = (LoginBinder) event.getSession().getAttribute("user");		
			logins.remove(loginBinder);		
		System.out.println(logins);
		
	}

}
