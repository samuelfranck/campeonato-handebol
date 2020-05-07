package com.samuelfranck.campeonatohandebol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.samuelfranck.campeonatohandebol.domain.Jogador;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Integer>{
	
	

}
