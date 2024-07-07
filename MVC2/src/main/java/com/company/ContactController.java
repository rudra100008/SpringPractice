package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path = "/processForm",method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("name")String name,
			@RequestParam("email")String email,
			@RequestParam("password")String password,
			Model model
			) 
	{
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Password: "+password);
		model.addAttribute("name",name);
		model.addAttribute("email",email);
		model.addAttribute("password",password);
		return "result";
	}
}
