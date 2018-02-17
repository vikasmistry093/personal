package com.solane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SolaneController {
	
	public SolaneController() {
		System.out.println("In controller.");
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
