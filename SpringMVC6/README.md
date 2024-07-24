# Spring MVC `@ExceptionHandler` Guide

## Overview

In Spring MVC, handling exceptions effectively is crucial for providing a robust user experience. The `@ExceptionHandler` annotation helps manage exceptions by allowing you to define custom responses when errors occur. This guide will walk you through the basics of using `@ExceptionHandler` to handle exceptions in your Spring MVC controllers.

## What is `@ExceptionHandler`?

`@ExceptionHandler` is an annotation used in Spring MVC to specify a method that handles exceptions thrown by controller methods. By defining an `@ExceptionHandler` method, you can control the response sent to the client when an exception is thrown, rather than letting the default error handling take over.

## How to Use `@ExceptionHandler`

### 1. Creating an Exception Handling Method

You can define a method in your controller or a `@ControllerAdvice` class annotated with `@ExceptionHandler`. This method should handle the exception types you want to manage and return a response entity or a view.

```java
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

     @ExceptionHandler(Exception.class) // Handles all exceptions
	    public String exceptionHandler(Exception ex, Model model) {
	        // Log the exception (optional)
	        ex.printStackTrace();
	        
	        // Add exception details to the model to display in the error page
	        model.addAttribute("exception", ex);
	        
	        return "error"; // Forward to error.jsp
	    }
}
