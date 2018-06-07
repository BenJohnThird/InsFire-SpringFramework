package com.benjohn.springframeworktry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PagesController 
{
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() 
	{
		ModelAndView mv = new ModelAndView("greetings");
		mv.addObject("greetings","Greetings from Douceur Teams!");
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
		ModelAndView mv = new ModelAndView("greetings");
		mv.addObject("greetings",greeting);
		return mv;
	}
}
