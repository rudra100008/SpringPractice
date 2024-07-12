package com.company.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
   public RedirectView one(Model model) {
	   System.out.println("This is one handler.");
	   model.addAttribute("message", "this is one  handler");
	   
	   RedirectView redirectView=new RedirectView();
	   redirectView.setUrl("https://www.facebook.com/");
	   //return "redirect:/two";
	return redirectView;
   }
	@RequestMapping("/two")
   public String two(Model model) {
	   System.out.println("this is two handle.");
	   model.addAttribute("message", "this is two handler");
	   return "hello";
   }
}
