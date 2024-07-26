package com.company.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

@Controller
public class PhotoController {
	
	@RequestMapping("/uploadfile")
   public String photoHandler() {
		
	   return "photo";
   }
	
	@PostMapping("/uploadphoto")
	public String photoSucess(@RequestParam("photo") MultipartFile file,HttpSession s ,Model model)throws IOException {
		byte[] data= file.getBytes();
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator 
				+"images"+File.separator + file.getOriginalFilename() ;
		System.out.println("\nPath: "+path);
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("\nPhoto uploaded......");
		model.addAttribute("messgae", "File Uploaded");
		model.addAttribute("fileName", file.getOriginalFilename());
		return "sucess";
	}
}