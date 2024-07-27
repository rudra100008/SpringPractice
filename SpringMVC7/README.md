# Spring MVC Exception Handling and Interception

This document provides an overview of how to use `@ControllerAdvice`, `@ExceptionHandler`, and `HandlerInterceptor` in a Spring MVC application. These components help in managing exceptions and intercepting HTTP requests effectively, leading to better handling of errors and pre/post-processing of requests.

## Table of Contents

1. [Introduction](#introduction)
2. [@ControllerAdvice](#controlleradvice)
   - [Overview](#overview)
   - [Usage Example](#usage-example)
3. [Implementing a HandlerInterceptor](#implementing-a-handlerinterceptor)
   - [Pre-Handle Method](#pre-handle-method)
   - [Post-Handle Method](#post-handle-method)
   - [After Completion Method](#after-completion-method)
4. [Registering the HandlerInterceptor](#registering-the-handlerinterceptor)
5. [Advanced Use Cases](#advanced-use-cases)
6. [Conclusion](#conclusion)

## Introduction

Spring MVC provides a powerful way to handle exceptions and intercept requests through `@ControllerAdvice`, `@ExceptionHandler`, and `HandlerInterceptor`. These components allow developers to centralize error handling logic and perform specific tasks before or after requests are processed.

## @ControllerAdvice

### Overview

`@ControllerAdvice` is a specialized component in Spring MVC used to define global exception handling and data binding across multiple controllers. It allows you to separate exception handling logic from your controllers, making your code cleaner and more maintainable.

### Usage Example

Here's a simple example of how to use `@ControllerAdvice` in a Spring MVC application:

```java
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String NullPointerHandler(Exception ex,Model model) {
		ex.printStackTrace();
		model.addAttribute("exception", ex);
		return "error";
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 @ExceptionHandler(Exception.class) // Handles all exceptions
	    public String exceptionHandler(Exception ex, Model model) {
	        // Log the exception (optional)
	        ex.printStackTrace();
	       
	        // Add exception details to the model to display in the error page
	        model.addAttribute("exception", ex);
	        return "error"; // Forward to error.jsp
	    }
}

## Implementing a HandlerInterceptor

To implement a custom `HandlerInterceptor`, you need to create a class that implements the `HandlerInterceptor` interface and override its methods.

Here's a step-by-step guide with code examples:

### Pre-Handle Method

The `preHandle` method is executed before the controller processes the request. It returns a boolean value that determines whether the request should proceed (`true`) or be stopped (`false`).

```java
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoggingInterceptor implements HandlerInterceptor {

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
## Conclusion
The HandlerInterceptor interface in Spring MVC provides a flexible and powerful mechanism for request interception. By using HandlerInterceptor, you can manage cross-cutting concerns such as logging, authentication, and performance monitoring in a clean and maintainable way.

By understanding and effectively utilizing HandlerInterceptor, you can enhance the robustness,

