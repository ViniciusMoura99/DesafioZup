package br.com.desafio.desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "APOSTA", schema = "Desafio_zup")
@SequenceGenerator(name = "APOSTA_SQ", schema = "Desafio_zup", sequenceName = "APOSTA_SQ", initialValue = 1, allocationSize = 1)
public class Aposta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "APOSTA_SQ")
	@Column(name = "ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ID_APOSTADOR")
	private Apostador idApostador;
	
	@Column(name = "NUMEROS")
    private String numeros;

	
	public Aposta() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Apostador getIdApostador() {
		return idApostador;
	}

	public void setIdApostador(Apostador idApostador) {
		this.idApostador = idApostador;
	}

	public String getNumeros() {
		return numeros;
	}

	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}

	
}
