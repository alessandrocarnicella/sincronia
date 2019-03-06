package com.sincrono.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String getIndex() {
		return "Login";
	}
	
	@RequestMapping("/Dashboard")
	public String getHello() {
		return "Dashboard";
	}

}
