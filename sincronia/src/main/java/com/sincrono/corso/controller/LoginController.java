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

	@RequestMapping("/Aziende")
	public String getAziende() {
		return "Aziende";
	}
	
	@RequestMapping("/Dipendenti")
	public String getDipendenti() {
		return "Dipendenti";
	}
	
	@RequestMapping("/Rapportini")
	public String getRapportini() {
		return "Rapportini";
	}
	
	@RequestMapping("/GestioneDipendenti")
	public String getGestioneDipendenti() {
		return "GestioneDipendenti";
	}
	
	@RequestMapping("/GestioneAziende")
	public String getGestioneAziende() {
		return "GestioneAziende";
	}
	
	@RequestMapping("/GestioneUtenti")
	public String getGestioneUtenti() {
		return "GestioneUtenti";
	}
	
}
