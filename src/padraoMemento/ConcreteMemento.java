package padraoMemento;

import java.util.Calendar;

import modelo.ConfiguracaoAmbiente;

public class ConcreteMemento implements Memento {
	private int nome;
	private float area;
	private String estacao, hora, tipoDeEspaco, grauDeFidelidade;
	private Calendar dataEhora;
	
	public ConcreteMemento(int nome, Calendar dataEhora, String estacao, String hora, String tipoDeEspaco, float area, String grauDeFidelidade) {
		this.nome = nome;
		this.estacao = estacao;
		this.hora = hora;
		this.tipoDeEspaco = tipoDeEspaco;
		this.area = area;
		this.grauDeFidelidade = grauDeFidelidade;
	}
	
	public int getName() {
		return this.nome;
	}
	
	public Calendar getDataEhora() {
		return this.dataEhora;
	}
	
	public String getEstacao() {
		return this.estacao;
	}
	
	public String getHora() {
		return this.hora;
	}
	
	public String getTipoDeEspaco() {
		return this.tipoDeEspaco;
	}
	
	public Float getArea() {
		return this.area;
	}
	
	public String getGrauDeFielidade() {
		return this.grauDeFidelidade;
	}
	

}
