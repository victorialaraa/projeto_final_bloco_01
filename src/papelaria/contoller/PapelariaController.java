package papelaria.contoller;

import papelaria.model.Carrinho;
import papelaria.model.Produto;
import papelaria.repository.PapelariaRepository;

public class PapelariaController implements PapelariaRepository {

	private Carrinho carrinho = new Carrinho();

	@Override
	public void exibirCarrinho() {
		if (carrinho.getList().isEmpty()) {
			System.out.println("O carrinho está vazio.");
		} else {
			for (Produto produto : carrinho.getList()) {
				System.out.println("Produto: " + produto.getNome());
			}
		}
	}

	@Override
	public void adicionarNoCarrinho(Produto produto) {
		carrinho.adicionarProduto(produto);
	}

	@Override
	public void exibirTotal() {
		double total = 0;

		for (Produto produto : carrinho.getList()) {
			produto.exibirDetalhes();
			total += produto.getPreco();
		}

		System.out.println("Total: R$" + total);
	}

	@Override
	public void finalizarPagamento() {
		if (carrinho.getList().isEmpty()) {
			System.out.println("Não há itens no carrinho para finalizar a compra.");
		} else {
			System.out.println("\nCompra finalizada!");
			exibirTotal();
			System.out.println("Obrigado por comprar conosco!");
			carrinho.getList().clear();
		}
	}
}
