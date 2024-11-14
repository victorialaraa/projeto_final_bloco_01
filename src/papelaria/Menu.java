package papelaria;

import java.util.Scanner;

import papelaria.contoller.PapelariaController;
import papelaria.model.Produto;
import papelaria.model.ProdutoPapelaria;

public class Menu {	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		PapelariaController controller = new PapelariaController();

		int opcao;
		boolean isEnabled = true;
		controller.carrgarProdutos();
		while (isEnabled) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     PAPELARIA                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Exibir produtos                      ");
			System.out.println("            2 - Adicionar ao carrinho                ");
			System.out.println("            3 - Verificar o carrinho                 ");			
			System.out.println("            4 - Finalizar o pagamento                ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 5) {
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Exibir produtos\n\n");
					controller.exibirTodosProdutos();

					break;
				case 2:
					System.out.print("Digite o ID do produto: ");
					int idProduto = leia.nextInt();
					try {
						ProdutoPapelaria produto = controller.selecionarProduto(idProduto);
						if(produto != null) {
							controller.adicionarNoCarrinho(produto);
							System.out.println("Adicionar ao carrinho " + produto.getNome() + "com sucesso! \n\n");
						} else {
							System.out.println("Produto não encontrado");
						}
					} catch(Exception e) {
						System.out.println("Erro inesperado, tente novamente");
					}
					
					break;
				case 3:
					System.out.println("Verificar o carrinho\n\n");
					controller.exibirCarrinho();
					

					break;
				case 4:
					System.out.println("Finalizar o pagamento\n\n");
					controller.finalizarPagamento();
					isEnabled = false;
					
				case 5:
					System.out.println("Obrigado e até a proxima!!!");
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