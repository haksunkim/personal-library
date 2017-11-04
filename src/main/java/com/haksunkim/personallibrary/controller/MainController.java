package com.haksunkim.personallibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haksunkim.personallibrary.config.YAMLConfig;

@Controller
public class MainController {
	@Autowired
	private YAMLConfig yamlConfig;	
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title", yamlConfig.getTitle());
		
		return "index";
	}
}
