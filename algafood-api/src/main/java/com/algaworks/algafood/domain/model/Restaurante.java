package com.algaworks.algafood.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurante {
	
	
	//ATRIBUTOS DA CLASSE
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento no banco
	private Long id;
	
	
	private String Nome;
	
	@Column(name= "taxa_frete")
	private BigDecimal taxaFrete;
	
	
	//GET AND SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public BigDecimal getTaxaFrete() {
		return taxaFrete;
	}

	public void setTaxaFrete(BigDecimal taxaFrete) {
		this.taxaFrete = taxaFrete;
	}
	
	
	//EQUALS AND HASHCODEV

	@Override
	public int hashCode() {
		return Objects.hash(Nome, id, taxaFrete);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(Nome, other.Nome) && Objects.equals(id, other.id)
				&& Objects.equals(taxaFrete, other.taxaFrete);
	}
	
	
	
	
	
	
	
	
	
	

}
