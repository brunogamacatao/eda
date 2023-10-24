package eda.listas;

public class ListaEncadeada implements Lista {
	Nodo cabeca;
	Nodo cauda;
	
	public void adicionar(String valor) {
		Nodo novo = new Nodo();
		novo.valor = valor;
		
		if (cabeca == null) { // se a lista está vazia
			cabeca = novo;
			cauda = novo;
		} else { // a lista NÃO está vazia
			cauda.proximo = novo;
			cauda = novo;
		}
	}
	
	public void listar() {
		Nodo atual = cabeca; // começo na cabeça da lista
		while (atual != null) { // enquanto não chegar no final
			System.out.println(atual.valor);
			atual = atual.proximo;
		}
	}
	
	public void remover(String valor) {
		// verificar se o valor para remover está na cabeça
		if (cabeca.valor.equals(valor)) {
			cabeca = cabeca.proximo;
			return;
		} 
		
		// vamos percorrer a lista a partir do segundo elemento
		Nodo anterior = cabeca;
		Nodo atual    = cabeca.proximo;
		
		while (atual != null) {
			if (atual.valor.equals(valor)) { // achei o elemento
				anterior.proximo = atual.proximo;
				break; // já removi, posso parar
			}
			
			anterior = anterior.proximo;
			atual = atual.proximo;
		}
	}
	
	public static void main(String[] args) {
		ListaEncadeada l = new ListaEncadeada();
		l.adicionar("João");
		l.adicionar("Maria");
		l.adicionar("Pedro");
		l.adicionar("Ana");
		l.remover("Maria");
		l.listar();
	}
}
