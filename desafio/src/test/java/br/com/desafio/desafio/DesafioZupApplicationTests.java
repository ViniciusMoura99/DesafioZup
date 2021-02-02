package br.com.desafio.desafio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.desafio.desafio.model.Apostador;
import br.com.desafio.desafio.service.LoteriaService;

@SpringBootTest
class DesafioZupApplicationTests {

	@Autowired
	private LoteriaService loteriaService;
	
	
	@Test
	void contextLoads() {
		Apostador apostador = new Apostador();
		
		apostador = loteriaService.gerarNumeroLoteria();
		System.out.println(apostador);
	}

}
