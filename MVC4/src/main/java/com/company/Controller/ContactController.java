package com.company.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.Model.User;
import com.company.Service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public  void commonData(Model model) {
		  model.addAttribute("Header", "Registration Form");
		  model.addAttribute("Desc","Home for programmer.");
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
      
        return "contact";
    }
	
	
	
	@RequestMapping(path = "/processForm",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) 
	{
		System.out.println(user);
		this.userService.createUser(user);
		return "result";
	}
	
	

	/*
	 * In this we Used @RequestParm() annotation which is very lengthy so we are going to use @ModelAttribute
	 * @RequestMapping(path = "/processForm",method = RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam("name")String name,
	 * 
	 * @RequestParam(name="email",required = false)String email,
	 * 
	 * @RequestParam("password")String password, Model model ) {
	 * 
	 * User user=new User(); user.setName(name); user.setEmail(email);
	 * user.setPassword(password); System.out.println(user);
	 * 
	 * model.addAttribute("user",user);
	 * 
	 * 
	 * model.addAttribute("name",name); model.addAttribute("email",email);
	 * model.addAttribute("password",password);
	 * 
	 * return "result"; }
	 */
}
