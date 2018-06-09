package com.benjohn.springframeworktry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.benjohn.backend.dao.ThreadsDAO;
import com.benjohn.backend.dto.Threads;

@Controller
public class PagesController 
{
	@Autowired
	private ThreadsDAO threadsDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() 
	{
		ModelAndView mv = new ModelAndView("layout");
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
		mv.addObject("userClickAllThreads",true);
		return mv;
	}
	
	@RequestMapping(value = {"/threads/{id}/thread"})
	public ModelAndView ShowThread(@PathVariable("id") int id) 
	{
		//FETCHING SPECIFIC ID		
		Threads thread = null;
		
		thread = threadsDAO.get(id);
		
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
	
//	PATH VARIABLE
	@RequestMapping(value = {"/test/{greeting}"})
	public ModelAndView test(@PathVariable("greeting") String greeting) 
	{
		if(greeting == null) 
		{
			greeting = "Ben John says hello";
		}
		ModelAndView mv = new ModelAndView("layout");
		mv.addObject("greetings",greeting);
		return mv;
	}
	
}
