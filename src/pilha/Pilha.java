package pilha;

import pilha.Nodo;

public class Pilha
{
	Nodo inicio;
	
	int numero;
	
	public void empilha(Nodo novoNodo)
	{
		novoNodo.prox = null;
		novoNodo.ant = null;
			  
		if (inicio == null)
		{
			inicio = novoNodo;
		}
			  
		else
		{
			novoNodo.prox = inicio;
			inicio.ant = novoNodo;
			inicio = novoNodo;
		}
	}
	
	public int desempilha()
	{
		numero = inicio.numero;
		
		inicio = inicio.prox;
		
		return numero;
	}
}
