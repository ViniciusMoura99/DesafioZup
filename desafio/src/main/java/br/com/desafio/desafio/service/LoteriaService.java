package br.com.desafio.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.desafio.client.loteria.LoteriaClient;
import br.com.desafio.desafio.model.Apostador;

@Service
public class LoteriaService {

	@Autowired
	private LoteriaClient loteriaClient;
	
	public Apostador gerarNumeroLoteria() {
		return loteriaClient.createAposta();
	}

}
