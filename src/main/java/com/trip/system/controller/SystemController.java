package com.trip.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trip.system.utils.GlobalData;
import com.trip.system.utils.GlobalUtil;

@Controller
public class SystemController {
	@RequestMapping("admin")
	public ModelAndView admin(HttpServletRequest request,HttpServletResponse response){
		ModelAndView view = new ModelAndView("index"); 
		view.addObject("sys", GlobalData.system);
		view.addObject("curUser", GlobalUtil.getLoginUser(request));
		return view; 
	}
	
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		return new ModelAndView("login"); 
	}
	
}
