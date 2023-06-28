package com.seleniumexpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.registerinfoDTO;

@Controller
public class registercontroller {
	

	@RequestMapping("/register")
	public String register(Model model){
		registerinfoDTO regDTO = new registerinfoDTO();
		model.addAttribute("reg", regDTO);
		
		return "register";
	}

	@RequestMapping("/process-register")
	public String processregister( @ModelAttribute("reg") registerinfoDTO regDTO )
		{
		
	
		return "process-register";
	      
	}

}
