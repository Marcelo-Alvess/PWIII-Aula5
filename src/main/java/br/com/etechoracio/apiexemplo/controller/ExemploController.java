package br.com.etechoracio.apiexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/exemplos")
@RestController

public class ExemploController {
	
	@GetMapping
	public String aloMundo() {
		return "Hello World";
	}
	
	@GetMapping("/{nome}/{sobrenome}")
	public String concatenar(@PathVariable String nome,
							 @PathVariable String sobrenome) {
		return nome + " " + sobrenome;
	}
	
	@GetMapping("/funcao")
	public double funcoes(@RequestParam("op") String operacao,
						  @RequestParam("num1") int num1,
						  @RequestParam("num2") int num2)
	{
		
		if(operacao.equals("soma")) {
			return num1 + num2;
		}
		else if(operacao.equals("subtracao")) {
			return num1 - num2;
		}
		else if(operacao.equals("divisao")) {
			return num1 / num2;
		}
		else{
			return num1 * num2;
		}
	}
}