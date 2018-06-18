package com.benjohn.springframeworktry.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.benjohn.backend.dao.ThreadsDAO;
import com.benjohn.backend.dao.UserDAO;
import com.benjohn.backend.dto.Threads;
import com.benjohn.backend.dto.User;

@Controller
@RequestMapping("/manage")
public class ManagementController 
{
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private ThreadsDAO threadDAO;
	
	@RequestMapping(value ="/threads", method = RequestMethod.GET)
	public ModelAndView showManageThreads(@RequestParam(name = "operation",required = false) String operation) 
	{
		ModelAndView mv = new ModelAndView("layout");
		mv.addObject("UserClickManageThreads", true);
		mv.addObject("title","Manage Threads");
		
		//DATE 
		String timeStamp = new SimpleDateFormat("YYYY-MM-DD HH:mm:SS").format(new Date());
		Threads newThread = new Threads();
		//SETTING SOME OF THE FIELDS
		newThread.setThreads_cover_image("no-image.png");
		newThread.setThreads_created_at(timeStamp);
		
		mv.addObject("Thread", newThread);
		if(operation != null) 
		{
			if(operation.equals("Thread")) 
			{
				mv.addObject("message", "Thread Added Successfully");
			}
		}
		return mv;
	}
	//HANDLING THREAD SUBMISSION
	@RequestMapping(value = "/threads", method = RequestMethod.POST)
	public String handleThreadSubmission(@ModelAttribute("Thread") Threads newThread) 
	{
		logger.info(newThread.toString());
		threadDAO.add(newThread);
	
		return "redirect:/manage/threads?operation=Thread";
	}
	
	//RETURNING OR BINDING THE USERS TO THE FORM
	@ModelAttribute("users")
	public List<User> getUsers()
	{
		return userDAO.listOfUser();
	}

}
