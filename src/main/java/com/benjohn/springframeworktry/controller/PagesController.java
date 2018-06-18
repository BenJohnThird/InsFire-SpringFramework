package com.benjohn.springframeworktry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.benjohn.backend.dao.ThreadsDAO;
import com.benjohn.backend.dao.UserDAO;
import com.benjohn.backend.dto.Threads;
import com.benjohn.springframeworktry.exception.ThreadNotFoundException;

@Controller
public class PagesController 
{
	private static final Logger logger = LoggerFactory.getLogger(PagesController.class);
	@Autowired
	private ThreadsDAO threadsDAO;
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() 
	{
		ModelAndView mv = new ModelAndView("layout");
		//LOGGER INDEX
		logger.info("Inside Page Controller Index Method - INFO");
		logger.debug("Inside Page Controller Index Method - DEBUG");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	@RequestMapping(value = {"/about"})
	public ModelAndView about() 
	{
		ModelAndView mv = new ModelAndView("layout");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	@RequestMapping(value = {"/services.htm"})
	public ModelAndView services() 
	{
		ModelAndView mv = new ModelAndView("layout");
		mv.addObject("title","Services");
		mv.addObject("userClickServices",true);
		return mv;
	}
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() 
	{
		ModelAndView mv = new ModelAndView("layout");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
	@RequestMapping(value = {"/threads/all/"})
	public ModelAndView ShowAllThreads() 
	{
		ModelAndView mv = new ModelAndView("layout");
		mv.addObject("title","Threads");
		//ADDING THE AUTOWIRED LIST		
		mv.addObject("threads",threadsDAO.listOfThreads());
		mv.addObject("users",userDAO.listOfUser());
		mv.addObject("userClickAllThreads",true);
		return mv;
	}
	
	@RequestMapping(value = {"/threads/{id}/thread"})
	public ModelAndView ShowThread(@PathVariable("id") int id) throws ThreadNotFoundException
	{
		//FETCHING SPECIFIC ID		
		Threads thread = null;
		
		thread = threadsDAO.get(id);
		
		if(thread == null) throw new ThreadNotFoundException();
		
		ModelAndView mv = new ModelAndView("layout");
		
		mv.addObject("title",thread.getThreads_title());
		//ADDING THE AUTOWIRED LIST		
		
		mv.addObject("threads",threadsDAO.listOfThreads());
		//single thread
		
		mv.addObject("thread",thread);
		mv.addObject("userClickSpecificThread",true);
		return mv;
	}
	
//REQUEST PARAM TYPE - it has ?	
//	@RequestMapping(value = {"/test"})
//	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) 
//	{
//		if(greeting == null) 
//		{
//			greeting = "Ben John says hello";
//		}
//		ModelAndView mv = new ModelAndView("greetings");
//		mv.addObject("greetings",greeting);
//		return mv;
//	}
	
}
