package com.company.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


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

	List<String> friends=new ArrayList<>();

	friends.add("Shyam");
	friends.add("Hari");
	friends.add("Shiva");
	model.addAttribute("f",friends);
		return "index";
	}
	 @RequestMapping("/help")
	 public ModelAndView help() {
		 //creating object of modelAndView
		 ModelAndView modelAndView =new ModelAndView();
		 //setting the key and data to send to view(here jsp)
		 modelAndView.addObject("help", "What help do you need?");
		 LocalDateTime now= LocalDateTime.now();
		 modelAndView.addObject("date",now);

		 List<Integer> list =new ArrayList<>();
		 list.add(90);
		 list.add(80);
		 list.add(95);
		 modelAndView.addObject("marks",list);
		 //setting which view  to send data
		 modelAndView.setViewName("help");


		 System.out.println("This is help page ");
		 return modelAndView;
	 }

}
