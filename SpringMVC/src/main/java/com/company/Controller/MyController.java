package com.company.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(path = "/handleForm",method=RequestMethod.POST)
	public  String formHandler(@ModelAttribute Form form) {
		System.out.println(form);
		Address address = form.getAddress();
	      System.out.println("City: "+address.getCity()); 
		return "sucess";
	}
	
}
