package modelo;

import java.util.Calendar;

import padraoMemento.ConcreteMemento;
import padraoMemento.Memento;

//Originator

public class ConfiguracaoAmbiente {
	private float area;
	private String estacao, hora, tipoDeEspaco, grauDeFidelidade;
	private int nome = 0;
	private Calendar dataEhora;
	
	public ConfiguracaoAmbiente(int nome, Calendar dataEhora, String estacao, String hora, String tipoDeEspaco, float area, String grauDeFidelidade) {
		this.estacao = estacao;
		this.hora = hora;
		this.tipoDeEspaco = tipoDeEspaco;
		this.area = area;
		this.grauDeFidelidade = grauDeFidelidade;
		this.saveState();
	}
	
	public Memento saveState() {
		this.dataEhora = Calendar.getInstance();
		nome++;
		new ConcreteMemento(
				nome, 
				dataEhora, 
				estacao, 
				hora, 
				tipoDeEspaco, 
				area, 
				grauDeFidelidade
		);
	}
	
	public void restore(Memento memento) {
		concreteMemento = (ConcreteMemento) memento;
		this.estacao = concreteMemento.
		
	}
}
