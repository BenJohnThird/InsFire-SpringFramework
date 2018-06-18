package com.benjohn.springframeworktry.exception;

import java.io.Serializable;

public class ThreadNotFoundException extends Exception implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public ThreadNotFoundException() 
	{
		this("Thread Not Found!");
	}
	public ThreadNotFoundException(String message) 
	{
		this.message = System.currentTimeMillis() + " : " + message;
	}
	public String getMessage() {
		return message;
	}

	
}
