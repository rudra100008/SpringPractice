package com.company.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
	/* If you want to @Overwrite only one method then use HandlerInterceptorAdapter else you can use HandlerInterceptor but you have to @Overwrite 
	 all method as it is interface */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is preHandler...........");
		String name=request.getParameter("name12");
		if(name.startsWith("a")) {
			response.setContentType("text/html");
			response.getWriter().println("<h4><font color=red>Name shouldnot start with 'a'</font></h4>");
			
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//empty
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//empty
	}

}
