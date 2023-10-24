package eda.listas;

import java.util.Comparator;

/**
 * Implementação da interface Comparator para objetos
 * do tipo Candidato. Nesse caso, os candidatos serão
 * ordenados da maior nota para a menor nota.
 */
public class ComparadorDeCandidatos implements Comparator<Candidato> {
	public int compare(Candidato c1, Candidato c2) {
		if (c1.getNota() > c2.getNota()) { 
			return -1; // a maior nota vem antes
		} else if (c1.getNota() < c2.getNota()) {
			return +1;
		}
		return 0; // são iguais
	}
}
