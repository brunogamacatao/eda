package eda.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteDasListas {
	public static void main(String[] args) {
		List<Candidato> candidatos = new ArrayList<>();
		
		candidatos.add(new Candidato("Ana", 850));
		candidatos.add(new Candidato("Pedro", 500));
		candidatos.add(new Candidato("João", 720));
		candidatos.add(new Candidato("Maria", 810));
		candidatos.add(new Candidato("José", 650));
		
		// Versão antiga - Java Collections Framework
		Collections.sort(candidatos, new ComparadorDeCandidatos());
		
		for (Candidato c : candidatos.subList(0, 3)) { 
			System.out.println(c);
		}
		
		// Versão nova - Streams
		candidatos.stream()
		.sorted(new ComparadorDeCandidatos())
		.limit(3)
		.forEach(c -> System.out.println(c));
	}
}
