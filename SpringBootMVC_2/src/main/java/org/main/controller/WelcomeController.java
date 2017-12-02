package org.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("name", "Vikas");
		return model;
	}

}
