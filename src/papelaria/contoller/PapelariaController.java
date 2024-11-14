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

}
