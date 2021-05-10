package interfaceDeUsuario;

import java.util.Scanner;

import modelo.ConfiguracaoAmbiente;

/**
 * 
 * DESCRIÇÃO
 * 
 *
 */

public class InterfaceDeUsuario {
	private Scanner entrada = new Scanner(System.in);
	private ConfiguracaoAmbiente ambiente;
	private float area;
	private String estacao, hora, tipoDeEspaco, grauDeFidelidade;
	int opcao;
	
	public void mostrarMenuPrincipal()
	{
		opcao=this.obterOpcao();
		while(opcao!=0)
		{
			switch(opcao)
			{
			case 1:
				System.out.println("Estação do ano - primavera, verão, outono ou inverno?");
				estacao = entrada.nextLine();
				
				System.out.println("Iníciar de manhã, tarde ou noite?");
				hora = entrada.nextLine();

				System.out.println("Tipo de espaço - templo ou montanhas?");
				tipoDeEspaco = entrada.nextLine();
				
				if(tipoDeEspaco.equals("templo")) {
					System.out.println("Área total");
					area = entrada.nextFloat();
				}
				
				System.out.println("Grau de fidelidade das leis da física - alto, médio ou baixo?");
				grauDeFidelidade = entrada.nextLine();
				
				new ConfiguracaoAmbiente(estacao, hora, tipoDeEspaco, area, grauDeFidelidade);

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
		System.out.println("2) Sair do sistema");
		System.out.println("----------------------------------");
		int opcao = entrada.nextInt();
		return opcao;
	}
	
	private void salvarEstadoErecuperar () {
		saveState()
	}
}
