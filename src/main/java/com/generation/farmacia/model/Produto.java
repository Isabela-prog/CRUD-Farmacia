package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.generation.farmacia.model.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "o nome do produto é obrigatório")
	@Size(min = 3, max = 5000, message = "o nome precisa ser maior que 3 e menor que 5000 caractéres")
	private String nome;
	
	@NotBlank(message = "a bula do produto é obrigatória")
	@Size(min = 10, max = 10000, message = "a bula precisa ser maior que 10 e menor que 10000 caractéres")
	private String bula;
	
	@NotNull
	private Double preco;
	
	@NotBlank(message = "o público do produto é obrigatório - infantil/ adulto/ todas")
	@Size(min = 6, max = 12, message = "o formato do público precisa ser maior que 6 e menor que 12 caractéres - Infantil/ adulto/ todos")
	private String publico;
	
	@ManyToOne // classe postagem many, classe é one
	@JsonIgnoreProperties("produto") //
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
