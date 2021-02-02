package br.com.desafio.desafio.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class BeanConfiguration {

	private String loteriaUrl;

	public BeanConfiguration(LoteriaConfiguration LoteriaConfiguration){
		this.loteriaUrl = LoteriaConfiguration.loteriaBaseUrl;
	}

	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder.baseUrl(loteriaUrl)
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();

	}
}