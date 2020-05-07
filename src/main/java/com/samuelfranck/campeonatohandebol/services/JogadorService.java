package com.samuelfranck.campeonatohandebol.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuelfranck.campeonatohandebol.domain.Jogador;
import com.samuelfranck.campeonatohandebol.repositories.JogadorRepository;
import com.samuelfranck.campeonatohandebol.services.exceptions.ObjectNotFoundException;


@Service
public class JogadorService {
	
	@Autowired
	private JogadorRepository repo;
	
	public Jogador find(Integer id) {
		Optional<Jogador> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado: Id: " 
		+ id+ ",Tipo: " + Jogador.class.getName()));
	}

}
