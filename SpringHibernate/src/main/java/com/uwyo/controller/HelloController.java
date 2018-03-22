package com.uwyo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/say")
public class HelloController {
	
	@RequestMapping(value="/sayhello", method = RequestMethod.GET)
	public String sayHello(ModelMap model){
		model.addAttribute("message", "Hello World!!");
		return "hello";
	}

}
