package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");

			System.out.println("***************************************************** ");
			System.out.println("                                                      ");
			System.out.println("                SUPLEMENTOS DO MONSTRÃO XxX               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas os suplementos          ");
			System.out.println("            3 - Atualizar dados dos produtos          ");
			System.out.println("            4 - Apagar dados dos produtos             ");
			System.out.println("            5 - Sair                                  ");
			System.out.println("                                                      ");
			System.out.println("***************************************************** ");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      " + Cores.ANSI_RED_BACKGROUND);

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSuplementos do monstrão! - Com você nós crescemos juntos! ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_WHITE + "\nOpção Inválida!\n" + Cores.TEXT_RESET);

				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Ivan Cassio Dias");

	}

}
