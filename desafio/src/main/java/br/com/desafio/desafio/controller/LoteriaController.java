package br.com.desafio.desafio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loteria")
public class LoteriaController {
	
	@PostMapping("/aposta")
	public ResponseEntity<?> createAposta() {
		System.out.println("teste");
		return ResponseEntity.ok().build();

	}

	@GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok().build();
    }
}
