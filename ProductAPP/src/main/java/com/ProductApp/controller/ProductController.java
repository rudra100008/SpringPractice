package com.ProductApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("/")
   public String index() {
	   return "index";
   }
	@RequestMapping("/addProduct")
	public String addProduct() {
		return "addProduct";
	}
}
