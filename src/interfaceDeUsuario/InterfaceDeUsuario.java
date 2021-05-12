package interfaceDeUsuario;

import java.util.Calendar;
import java.util.Scanner;

import modelo.ConfiguracaoAmbiente;
import padraoMemento.Caretaker;

/**
 * 
 * DESCRIÇÃO
 * 
 *
 */

public class InterfaceDeUsuario {
	private Scanner entrada = new Scanner(System.in);
	private Caretaker oZeladorDosMementos = new Caretaker();
	private ConfiguracaoAmbiente ambiente;
	private int nome = 0;
	private float area;
	private String estacao, hora, tipoDeEspaco, grauDeFidelidade;
	private Calendar dataEhora;
	int opcao = 0;
	
	public void mostrarMenuPrincipal()
	{
		while(opcao != 4)
		{
			opcao=this.obterOpcao();
			switch(opcao)
			{
			case 1:
				ambiente = null;
				
				System.out.println("Estação do ano - primavera, verão, outono ou inverno?");
				entrada.nextLine();
				estacao = entrada.nextLine();
				
				System.out.println("Iníciar de manhã, tarde ou noite?");
				hora = entrada.nextLine();

				System.out.println("Tipo de espaço - templo ou montanhas?");
				tipoDeEspaco = entrada.nextLine();
				
				if(tipoDeEspaco.equals("templo")) {
					System.out.println("Área total em m2:");
					area = entrada.nextFloat();
				}
				else {
					this.area = 0;
				}
				
				System.out.println("Grau de fidelidade das leis da física - alto, médio ou baixo?");
				entrada.nextLine();
				grauDeFidelidade = entrada.nextLine();
				
				nome++;
				
				ambiente = new ConfiguracaoAmbiente(nome, dataEhora, estacao, hora, tipoDeEspaco, area, grauDeFidelidade);
				
				this.oZeladorDosMementos.backup(ambiente);

				System.out.println("Configurações salvas!");
				
				break;
				
			case 2:
				this.oZeladorDosMementos.restore(ambiente);
				
				System.out.println("Configurações anteriores restauradas!");
				break;
				
			case 3:
				this.oZeladorDosMementos.exibirConfiguracaoAtual();
				break;
			}
		}
				
	}
	
	private int obterOpcao()
	{
		System.out.println("-------- Jiu-jitsu --------");
		System.out.println("---- Matrix simulation ----");
		System.out.println("---- Version 1.2 PT-BR ----");
		System.out.println("------- 2189 - 2199 -------");
		System.out.println("1) Configuração da sala de treino");
		System.out.println("2) Restaurar ao estado anterior");
		System.out.println("3) Exibir útlima configuração");
		System.out.println("4) Sair do sistema");
		System.out.println("----------------------------------");
		int opcao = entrada.nextInt();
		return opcao;
	}
}
