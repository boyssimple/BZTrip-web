package com.trip.system.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ActionHelper {
	public static void writeToJson(String json,HttpServletResponse response){
		try {
			PrintWriter writer = response.getWriter();
			response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			writer.print(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
