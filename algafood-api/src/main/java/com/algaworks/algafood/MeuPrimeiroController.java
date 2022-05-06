package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
	
	
	@GetMapping("/hello") //mapeia o caminho
	@ResponseBody //indica que o retorno é enviado como resposta
	public String hello() {
		
		
		return "hello";
	}

}
