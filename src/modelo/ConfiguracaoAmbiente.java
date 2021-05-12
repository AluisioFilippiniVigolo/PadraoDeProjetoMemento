package modelo;

import padraoMemento.ConcreteMemento;
import padraoMemento.Memento;

import java.util.Calendar;

//Originator

public class ConfiguracaoAmbiente {
	private float area;
	private String estacao, hora, tipoDeEspaco, grauDeFidelidade;
	private int nome;
	private Calendar dataEhora;
	private ConcreteMemento concreteMemento;
	
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
		return new ConcreteMemento(nome, dataEhora, estacao, hora, tipoDeEspaco, area, grauDeFidelidade);
	}
	
	public void restore(ConcreteMemento concreteMemento) {
		this.estacao = concreteMemento.getEstacao();
		this.hora = concreteMemento.getHora();
		this.tipoDeEspaco = concreteMemento.getTipoDeEspaco();
		this.area = concreteMemento.getArea();
		this.grauDeFidelidade = concreteMemento.getGrauDeFielidade();
		this.nome = concreteMemento.getName();
		this.dataEhora = concreteMemento.getDataEhora();	
	}
}
