package pilha;

import pilha.Nodo;

public class Nodo {

	int numero;
	Nodo prox;
	Nodo ant;
	
	public Nodo(int numero)
	{
		this.numero = numero;
		prox = null;
		ant = null;
	}
}