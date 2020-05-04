package com.samuelfranck.campeonatohandebol.domain;

import java.io.Serializable;
import java.util.Date;

public class Jogador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Date dataNascimento;
	private String genero;
	private Double altura;
	private Double peso;
	
	private Time timeEmQueJoga;
	
	private Time timeQueCapitaneia;
	
	public Jogador() {
	}

	public Jogador(Integer id, String nome, Date dataNascimento, String genero, Double altura, Double peso,
			Time timeEmQueJoga, Time timeQueCapitaneia) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.altura = altura;
		this.peso = peso;
		this.timeEmQueJoga = timeEmQueJoga;
		this.timeQueCapitaneia = timeQueCapitaneia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Time getTimeEmQueJoga() {
		return timeEmQueJoga;
	}

	public void setTimeEmQueJoga(Time timeEmQueJoga) {
		this.timeEmQueJoga = timeEmQueJoga;
	}

	public Time getTimeQueCapitaneia() {
		return timeQueCapitaneia;
	}

	public void setTimeQueCapitaneia(Time timeQueCapitaneia) {
		this.timeQueCapitaneia = timeQueCapitaneia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
