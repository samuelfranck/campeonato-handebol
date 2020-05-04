package com.samuelfranck.campeonatohandebol.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Time implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	private Jogador capitao;
	
	private List<Jogador> jogadores = new ArrayList<>();
	
	public Time() {
	}

	public Time(Integer id, String nome, Jogador capitao) {
		super();
		this.id = id;
		this.nome = nome;
		this.setCapitao(capitao);
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
	
	public Jogador getCapitao() {
		return capitao;
	}

	public void setCapitao(Jogador capitao) {
		this.capitao = capitao;
	}


	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
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
		Time other = (Time) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

		
	

}
