package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//public class lovecaaalculatorApplicationinitializer //implements WebApplicationInitializer {

	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println(" The custom class startup method >>> Nayana");
		
		AnnotationConfigWebApplicationContext webappcontext = new AnnotationConfigWebApplicationContext();
		webappcontext.register(lovecalculatorapplicationconfig.class);
		
		 * XmlWebApplicationContext webApplicationContext = new
		 * XmlWebApplicationContext();
		 * webApplicationContext.setConfigLocation("classpath:applicationconfig.xml");
		 
		
		//create the dispatcher servlet object 
		DispatcherServlet  dispatcherServlet = new DispatcherServlet(webappcontext) ;
		ServletRegistration.Dynamic  dispatcher =  servletContext.addServlet("front-dispatcher", dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/mywebsite.com/*");
	}
	}

*/
