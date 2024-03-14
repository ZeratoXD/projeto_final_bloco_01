package ecommerce;

import java.io.IOException;
import java.util.Scanner;

import ecommerce.model.Creatina;
import ecommerce.model.Ecommerce;
import ecommerce.util.Cores;
import ecommercer.controller.EcommerceController;

public class Menu {

	public static void main(String[] args) {

		EcommerceController suplementos = new EcommerceController();

		Scanner leia = new Scanner(System.in);

		

		int opcao, id = 0;
		String nome, marca, produto, treino;
		float preco;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");

			System.out.println("***************************************************** ");
			System.out.println("                                                      ");
			System.out.println("                SUPLEMENTOS DO MONSTRÃO XxX               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Insira os Produtos                          ");
			System.out.println("            2 - Listar todas os suplementos          ");
			System.out.println("            3 - Atualizar dados dos produtos          ");
			System.out.println("            4 - Apagar dados dos produtos             ");
			System.out.println("            5 - Sair                                  ");
			System.out.println("                                                      ");
			System.out.println("***************************************************** ");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      " + Cores.ANSI_BLACK_BACKGROUND_BRIGHT);

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println(
						Cores.TEXT_WHITE + "\nSuplementos do monstrão! - Com você nós crescemos juntos! ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Insira o Produto:\n\n");
				System.out.println("Cadastre um novo suplemento\n\n");

				leia.nextLine();
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				System.out.println("Informe o valor (R$) : ");

				preco = leia.nextFloat();
				leia.nextLine();
				System.out.println("Digite a marca: ");
				marca = leia.nextLine();

				System.out.println("Informe o seu pré-treino :  ");
				treino = leia.nextLine();
				suplementos.adicionarProduto(new Creatina(suplementos.gerarId(), marca, nome, preco, treino));

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os suplementos\n\n");
				suplementos.buscarProdutos();

				keyPress();
				break;
			case 3:
				System.out.println("Atualizar dados do Produto\n\n");

				System.out.println("Digite o Id do produto: ");
				id = leia.nextInt();

				var buscaConta = suplementos.buscarNaCollection(id);

				if (buscaConta != null) {

					id = buscaConta.getId();
					System.out.println("Digite o número da Agência: ");
					nome = leia.nextLine();
					System.out.println("Digite o nome do Titular: ");
					leia.skip("\\R?");
					marca = leia.nextLine();

					System.out.println("Digite o saldo da Conta (R$): ");
					preco = leia.nextFloat();

					System.out.println("Digite 1 para o pré treino");

					System.out.println("Informe o seu pré-treino : ");
					treino = leia.nextLine();

					suplementos.atualizarProduto(new Creatina(suplementos.gerarId(), marca, nome, preco, treino));

				} else {
					System.out.println("O cadastro não foi encontrado!");
				}

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Apagar os dados selecionados");

				System.out.println("Digite o ID do produto: ");
				treino = leia.nextLine();
				leia.nextLine();
				suplementos.removerProduto(id);

				keyPress();
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

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
