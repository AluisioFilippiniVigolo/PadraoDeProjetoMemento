package padraoMemento;

public class Pilha
{
	Nodo inicio, atual;
	
	Memento memento;
	
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
	
	public Memento desempilha()
	{
		inicio = inicio.prox;
		
		return inicio.memento;
	}
	
	public Memento verTopo() {
		return inicio.memento;
	}
}