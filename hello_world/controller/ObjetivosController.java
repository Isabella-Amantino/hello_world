package com.hello_world.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return "<h2>Os objetivos de aprendizagem desta semana na Generation Brasil:</h2>"
				+"<li>Banco de Dados - MySQL Workbench"
				+"<li>Spring Boot - Java";
	}

}
