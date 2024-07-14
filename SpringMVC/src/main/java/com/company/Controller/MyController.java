package com.company.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


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
	public  String formHandler(@RequestParam("name") String name,@RequestParam("id") Long id) {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		return "sucess";
	}
}
