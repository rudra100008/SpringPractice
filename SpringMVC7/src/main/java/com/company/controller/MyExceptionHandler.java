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
