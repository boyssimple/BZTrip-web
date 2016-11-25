package com.trip.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trip.system.utils.GlobalData;
import com.trip.system.utils.GlobalUtil;

@Controller
@RequestMapping("admin")
public class AdminController {

	@RequestMapping("userManager")
	public ModelAndView userList(HttpServletRequest request,HttpServletResponse response){
		ModelAndView view = new ModelAndView("admin/userManager"); 
		view.addObject("sys", GlobalData.system);
		view.addObject("curUser", GlobalUtil.getLoginUser(request));
		return view; 
	}
	
	@RequestMapping("addUser")
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response){
		ModelAndView view = new ModelAndView("admin/user-add"); 
		view.addObject("sys", GlobalData.system);
		view.addObject("curUser", GlobalUtil.getLoginUser(request));
		return view; 
	}
}
