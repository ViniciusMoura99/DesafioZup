package br.com.desafio.desafio.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "APOSTADOR", schema = "Desafio_zup")
@SequenceGenerator(name = "APOSTADOR_SQ", schema = "Desafio_zup", sequenceName = "APOSTADOR_SQ", initialValue = 1, allocationSize = 1)
public class Apostador {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "APOSTADOR_SQ")
    @Column(name = "ID")
    private Long id;
	
	@Column(name = "EMAIL")
    private String email;
	
	@OneToMany(cascade = { CascadeType.ALL })
    @JoinColumn(name = "ID_APOSTADOR")
	private List<Aposta> apostas;

	
	public Apostador() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Aposta> getApostas() {
		return apostas;
	}

	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	} 
		
	

}
