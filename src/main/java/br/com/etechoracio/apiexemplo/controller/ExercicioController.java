package br.com.etechoracio.apiexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/exercicio")
@RestController
public class ExercicioController {
	@GetMapping("/dobro")
	public double funcoesDobro(@RequestParam("num") double num) {
		return num * 2; 
	}
	
	@GetMapping("/potencia")
	public double funcoesPotencia(@RequestParam("num1P") double num1P,
						  	 	  @RequestParam("num2P") double num2P) 
	{
		return Math.pow(num1P, num2P); 
	}
	
	@GetMapping("/raiz")
	public double funcoesRaiz(@RequestParam("num1R") double num1R) {
		return Math.sqrt(num1R); 
	}
}
