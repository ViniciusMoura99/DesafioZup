package br.com.desafio.desafio.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class LoteriaConfiguration {

	@Value("${loteria.base-url}")
	public String loteriaBaseUrl;

	@Value("${loteria.aposta}")
	public String createApostaResource;

	@Value("${loteria.loteria2}")
	public String loteria2;

}


