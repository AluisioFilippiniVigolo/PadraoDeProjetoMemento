package padraoMemento;

import modelo.ConfiguracaoAmbiente;

public class Caretaker {
	private Memento memento;
	private ConcreteMemento concreteMemento;
	private Pilha aPilha = new Pilha();
	
	public void backup(ConfiguracaoAmbiente ambiente) {
		memento = ambiente.saveState();
		Nodo novoNodo = new Nodo(memento);
		this.aPilha.empilha(novoNodo);
		
		System.out.println("Estado atual salvo com sucesso!");
	}
	
	public void restore(ConfiguracaoAmbiente ambiente) {
		memento = this.aPilha.desempilha();
		concreteMemento = (ConcreteMemento) memento;
		
		ambiente.restore(concreteMemento);
	}
	
	public void exibirConfiguracaoAtual() {
		memento = null;
		memento = this.aPilha.verTopo();
		concreteMemento = (ConcreteMemento) memento;
		System.out.println(concreteMemento.getEstacao() + concreteMemento.getHora() + concreteMemento.getTipoDeEspaco() + concreteMemento.getArea() + concreteMemento.getGrauDeFielidade());
	}
}
