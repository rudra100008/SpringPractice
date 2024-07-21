package com.company.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.model.Form;
import com.company.service.FormService;


@Controller
public class MyController {
	@Autowired
   private FormService formService;
	@RequestMapping("/")
	public String home() {
		return "home";
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
//	@GetMapping("/handleForm")
//    public String getForms(Model model) {
//        List<Form> forms = formService.getAllForm();
//        model.addAttribute("form", forms);
//        return "sucess";
//    }
	
}
