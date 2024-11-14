package papelaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     PAPELARIA                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Exibir produtos                      ");
			System.out.println("            2 - Adicionar ao carrinho                ");
			System.out.println("            3 - Verificar o carrinho                 ");
			System.out.println("            4 - Remover do carrinho                  ");			
			System.out.println("            5 - Finalizar o pagamento                ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Exibir produtos\n\n");

					break;
				case 2:
					System.out.println("Adicionar ao carrinho\n\n");

					break;
				case 3:
					System.out.println("Verificar o carrinho\n\n");

					break;
				case 4:
					System.out.println("Remover do carrinho \n\n");

					break;
				case 5:
					System.out.println("Finalizar o pagamento\n\n");

					break;
					
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Victoria Lara do Nascimento - victoriap99@gmail.com");
		System.out.println("https://github.com/victorialaraa/projeto_final_bloco_01");
		System.out.println("*********************************************************");
	}
}