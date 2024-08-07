package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(method=RequestMethod.GET)
	public String printHello(ModelMap model) {
		System.out.println("printhello is working");
	      model.addAttribute("message", "Hello Spring MVC Framework");

	      return "hello";
	}
}
