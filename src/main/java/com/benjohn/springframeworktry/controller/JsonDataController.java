package com.benjohn.springframeworktry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.benjohn.backend.dao.ThreadsDAO;
import com.benjohn.backend.dao.UserDAO;
import com.benjohn.backend.dto.Threads;
import com.benjohn.backend.dto.User;

@Controller
@RequestMapping("/json/data")
public class JsonDataController 
{
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private ThreadsDAO threadsDAO;
	
	//FOR USER
	@RequestMapping("/all/user")
	@ResponseBody
	public List<User> getAllUser()
	{
		return userDAO.listOfUser();
	}
	
	//FOR USER
	@RequestMapping("/user/{id}")
	@ResponseBody
	public User getSpecificUser(@PathVariable("id") int id)
	{
		return userDAO.get(id);
	}
	
	@RequestMapping("/all/threads")
	@ResponseBody
	public List<Threads> getAllThreads()
	{
		return threadsDAO.listOfThreads();
	}
	@RequestMapping("/thread/{id}")
	@ResponseBody
	public Threads getAllThreads(@PathVariable("id") int id)
	{
		return threadsDAO.get(id);
	}
}
