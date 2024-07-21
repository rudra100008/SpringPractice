package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PhotoController {
	
	@RequestMapping("/uploadfile")
   public String photoHandler() {
	   
	   return "photo";
   }
	@PostMapping("/uploadphoto")
	public String photoSucess(@RequestParam("photo") MultipartFile file) {
		
		return "sucess";
	}
}