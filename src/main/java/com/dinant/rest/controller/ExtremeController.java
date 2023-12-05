package com.dinant.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExtremeController {
	
	@GetMapping("/extreme")
	public String goExtreme(Model model) {
		model.addAttribute("titulo","FUNCIONA");
		return "views/users/extreme";
	}

}
