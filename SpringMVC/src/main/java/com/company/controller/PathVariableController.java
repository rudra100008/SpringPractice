package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
    @RequestMapping(path = "/home/{id}")
	public String handler(@PathVariable("id")  int id) {
    	System.out.println("ID: "+id);
    	return "home";
    }
	
}
