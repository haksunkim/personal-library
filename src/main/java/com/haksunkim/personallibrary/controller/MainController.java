package com.haksunkim.personallibrary.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@Value("${title}")
	private String applicationTitle;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title", applicationTitle);
		
		return "index";
	}
}
