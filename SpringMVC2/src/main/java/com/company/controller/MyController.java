package com.company.controller;



import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.model.Form;


@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/form")
	public String showForm() {
		 return "form";
	}
	@PostMapping(path = "/handleForm")
	public  String formHandler(@ModelAttribute("form") Form form,BindingResult result) {
		if(result.hasErrors()) {
			return "form";
		}
		
		return "sucess";
	}
	
}
