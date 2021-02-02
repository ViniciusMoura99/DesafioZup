package br.com.desafio.desafio.client.loteria;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import br.com.desafio.desafio.configuration.LoteriaConfiguration;
import br.com.desafio.desafio.model.Apostador;

@Component
public class LoteriaClient {

	private WebClient webClient;
	private final String createApostaResource;

	public LoteriaClient(WebClient webClient, LoteriaConfiguration loteriaConfiguration) {
		this.webClient = webClient;
		this.createApostaResource = loteriaConfiguration.createApostaResource;
	}

	public Apostador createAposta(){
		Apostador apostador = webClient.post()
									.uri(createApostaResource)
									.retrieve()
									.bodyToMono(Apostador.class)
									.block();
		return apostador;		
	}
}
