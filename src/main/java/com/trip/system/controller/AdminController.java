package com.trip.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	@RequestMapping("hello")
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response){
		return new ModelAndView("admin/hello"); 
	}
}
