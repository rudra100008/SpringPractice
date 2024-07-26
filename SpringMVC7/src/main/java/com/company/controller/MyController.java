package com.company.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.company.model.Form;
import com.company.service.FormService;


@Controller
public class MyController {
	@Autowired
   private FormService formService;
	@RequestMapping("/")
	public String home() {
		System.out.println("Home page is running.......");
		return "home";
	}
	@PostMapping(path="/welcome")
	public String nameHandler(@RequestParam("name12") String name,Model model) {
		model.addAttribute("name", name);
		System.out.println(name);
		return "welcome";
	}
	@RequestMapping("/form")
	public String showForm() {
		 return "form";
	}
	@PostMapping(path = "/handleForm")
	public  String formHandler(@ModelAttribute("form") Form form,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "form";
		}
		this.formService.createForm(form);
		List<Form> forms = formService.getAllForms();
        model.addAttribute("forms", forms);
		return "sucess";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String NullPointerHandler(Exception ex,Model model) {
		ex.printStackTrace();
		model.addAttribute("exception", ex);
		return "error";
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 @ExceptionHandler(Exception.class) // Handles all exceptions
	    public String exceptionHandler(Exception ex, Model model) {
	        // Log the exception (optional)
	        ex.printStackTrace();
	       
	        // Add exception details to the model to display in the error page
	        model.addAttribute("exception", ex);
	        
	        return "error"; // Forward to error.jsp
	    }
	
	
//	@GetMapping("/handleForm")
//    public String getForms(Model model) {
//        List<Form> forms = formService.getAllForm();
//        model.addAttribute("form", forms);
//        return "sucess";
//    }
	
	
	
}
