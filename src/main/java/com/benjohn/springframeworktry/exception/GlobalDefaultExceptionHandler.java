package com.benjohn.springframeworktry.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler 
{
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() 
	{
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("ErrorTitle", "Ooops! InsFire Error");
		mv.addObject("ErrorDescription", "Sorry, this page isn't available right now");
		mv.addObject("title", "404 Error Page");
		return mv;
	}
	
	@ExceptionHandler(ThreadNotFoundException.class)
	public ModelAndView handlerNoThreadFoundException() 
	{
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("ErrorTitle", "Ooops! InsFire Error");
		mv.addObject("ErrorDescription", "Sorry, the thread you are looking for is unavailable or cannot be reached");
		mv.addObject("title", "Thread Not Found");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ab) 
	{
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("ErrorTitle", "Ooops! InsFire Error");
		//mv.addObject("ErrorDescription", "Sorry, Please contact the administrator");
		//FOR DEBUGGING THE APPLICATION
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		ab.printStackTrace(pw);
		
		mv.addObject("ErrorDescription", sw.toString());
		mv.addObject("title", "Error");
		return mv;
	}
}
