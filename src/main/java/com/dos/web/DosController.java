package com.dos.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(name="/")
public class DosController {

	public DosController() {
		// TODO Auto-generated constructor stub
	}
	
	//@GetMapping
	@RequestMapping(value="", method=RequestMethod.GET)
	public String navIndex(Model model) {
		return "index";
	}

}
