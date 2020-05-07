package com.samuelfranck.campeonatohandebol;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.samuelfranck.campeonatohandebol.domain.Jogador;
import com.samuelfranck.campeonatohandebol.domain.Time;
import com.samuelfranck.campeonatohandebol.repositories.JogadorRepository;
import com.samuelfranck.campeonatohandebol.repositories.TimeRepository;

@SpringBootApplication
public class CampeonatoHandebolApplication implements CommandLineRunner {

	@Autowired
	private JogadorRepository jogadorRepository;
	@Autowired
	private TimeRepository timeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CampeonatoHandebolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Jogador j1 = new Jogador(null, "João da Silva", sdf.parse("11/07/1990"), "Masculino", 1.81, 80.0);
		Jogador j2 = new Jogador(null, "Marco Túlio", sdf.parse("21/03/1989"), "Masculino", 1.74, 78.4);
		Jogador j3 = new Jogador(null, "Túlio Mendes", sdf.parse("03/12/1991"), "Masculino", 1.73, 81.2);
		Jogador j4 = new Jogador(null, "Carlos Teles", sdf.parse("14/08/1987"), "Masculino", 1.86, 84.0);
		
		Time t1 = new Time(null, "Flamengo");
		Time t2 = new Time(null, "Conrinthians");
		
		j1.setTimeEmQueJoga(t1);
		j2.setTimeEmQueJoga(t1);
		j3.setTimeEmQueJoga(t2);
		j4.setTimeEmQueJoga(t2);
		
		t1.getJogadores().addAll(Arrays.asList(j1, j2));
		t2.getJogadores().addAll(Arrays.asList(j3, j4));
		
		t1.setCapitao(j1);
		t2.setCapitao(j4);
		
		timeRepository.saveAll(Arrays.asList(t1, t2));
		jogadorRepository.saveAll(Arrays.asList(j1, j2, j3, j4));
		
	}

}
