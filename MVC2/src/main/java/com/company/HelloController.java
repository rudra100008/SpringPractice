package com.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String printHello(Model model) {
		System.out.println("printhello is working");
	      model.addAttribute("message", "Hello Spring MVC Framework");
	      return "hello";
	}
	 @RequestMapping("/")
	public String index(Model model) {
		System.out.println("Index function is working...........");
		model.addAttribute("name","Ashum Bhuju Shrestha");
		model.addAttribute("age",23);
		
	List<String> friends=new ArrayList<String>();
	
	friends.add("Shyam");
	friends.add("Hari");
	friends.add("Shiva");
	model.addAttribute("f",friends);
		return "index";
	}
}
