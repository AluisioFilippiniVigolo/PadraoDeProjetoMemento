package padraoMemento;

import padraoMemento.Nodo;

public class Nodo {

	Memento memento;
	Nodo prox;
	Nodo ant;
	
	public Nodo(Memento memento)
	{
		this.memento = memento;
		prox = null;
		ant = null;
	}
}
