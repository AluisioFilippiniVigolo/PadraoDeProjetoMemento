package padraoMemento;

import modelo.ConfiguracaoAmbiente;

public class Caretaker {
	private Memento[] osMementos = new Memento[100];
	int tamanho = 0;
	int capacidade = 100;
	ConfiguracaoAmbiente configuracaoAmbiente;
	Memento memento;
	
	public void backup() {
		if (tamanho < capacidade) {
			this.osMementos[tamanho] = configuracaoAmbiente.saveState();
			tamanho++;
			System.out.println("Estado atual salvo com sucesso!");
		}
	}
	
	public void restore() {
		memento = this.osMementos[tamanho];
		
		this.configuracaoAmbiente.restore(memento);
	}
}
