package com.trip.system.listener;

import java.util.ResourceBundle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.trip.system.model.SystemInfo;
import com.trip.system.utils.GlobalData;

public class InitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("系统初始化.....");
		//获得全局变量
//		ServletContext servletContext = sce.getServletContext();
//        //设置全局变量属性
//        servletContext.setAttribute("test","test1");
		
        // 1.初始化系统信息
        ResourceBundle rb = ResourceBundle.getBundle("system"); 
        SystemInfo sys = new SystemInfo();
        sys.setAppName(rb.getString("application_name"));
        GlobalData.system = sys;
        // 2.初始化用户菜单
        
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("系统注销中.....");
	}

}
