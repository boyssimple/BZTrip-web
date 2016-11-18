package com.trip.system.utils;

import javax.servlet.http.HttpServletRequest;

import com.trip.system.model.User;

public class GlobalUtil {
	public static User getLoginUser(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("SESSION_USER");
		return user;
	}
	
	public static void setLoginUser(HttpServletRequest request,User user){
		request.getSession().setAttribute("SESSION_USER",user);
	}
	
	public static String getContextPath(HttpServletRequest request){
		
		String url = "";
		url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath()+"/";

		return url;
	}
}
