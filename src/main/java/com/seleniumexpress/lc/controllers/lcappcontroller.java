package com.seleniumexpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class lcappcontroller {

	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("uinform") UserInfoDTO ut)// (Model m )
	{

		// m.addAttribute("uinform", uinfo );
		return "homepage";

	}

	/*
	 * @RequestMapping("/process-homepage") public String
	 * processhomepage(@RequestParam ("username") String user ,@RequestParam
	 * ("crushname")String crush, Model model ) { System.out.println("username :"
	 * +user); System.out.println("crushname :" +crush);
	 * model.addAttribute("username", user); model.addAttribute("crushname" ,crush);
	 * 
	 * return "process-homepage";
	 * 
	 * }
	 */
	@RequestMapping("/process-homepage")
	public String processhomepage(@ModelAttribute("userinfo") UserInfoDTO uinfo, Model m) {
		System.out.println("The username is " + uinfo.getUsername());
		System.out.println("The crushname is " + uinfo.getCrushname());
		// m.addAttribute("userinfo",uinfo );

		return "process-homepage";
	}



}