package eda.listas;

public class Vector implements Lista {
	private String[] elementos = new String[10];
	private int proximo = 0;
	
	public void adicionar(String valor) {
		if (proximo >= elementos.length) { // se enchi o array
			// 1. crio um novo array com 2x o tamanho do antigo
			String[] novoArray = new String[elementos.length * 2];
			// 2. copio tudo do array antigo pro novo
			for (int i = 0; i < elementos.length; i++) {
				novoArray[i] = elementos[i];
			}
			// 3. digo que o array usado na classe é o novo
			elementos = novoArray;
		}
		elementos[proximo++] = valor;
	}
	
	public void listar() {
		for (int i = 0; i < proximo; i++) {
			System.out.println(elementos[i]);
		}
	}

	public void remover(String valor) {
		// 1. Encontrar o índice do elemento que eu quero remover
		for (int i = 0; i < elementos.length; i++) {
			// Achei o elemento que eu quero remover
			if (elementos[i].equals(valor)) {
				// Desse índice pra frente vou copiando 
				// um elemento para trás
				for (int j = i; j < elementos.length - 1; j++) {
					elementos[j] = elementos[j + 1];
				}
				// Depois que eu removi, decremento o próximo
				proximo--;
				break;
			}
		}
	}

	public static void main(String[] args) {
		Vector v = new Vector();
		v.adicionar("A");
		v.adicionar("B");
		v.adicionar("C");
		v.adicionar("D");
		v.remover("B");
		v.listar();
	}
}
