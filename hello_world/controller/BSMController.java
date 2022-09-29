package com.hello_world.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSMController {

	@GetMapping
	public String bsm() {
		return "<h2>BSM's Generation Brasil</h2>"
				+"<h4>Mentalidades:</h4>"
				+"<li>Orientação ao futuro"
				+"<li>Persistência"
				+"<li>Responsabilidade pessoal"
				+"<li>Mentalidade de crescimento<br>"
				+"<br><h4>Habilidades:</h4>"
				+"<li>Atenção aos detalhes"
				+"<li>Comunicação"
				+"<li>Proatividade"
				+"<li>Trabalho em equipe";
		
	}
}
