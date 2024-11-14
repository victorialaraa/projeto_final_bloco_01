package papelaria.contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import papelaria.model.Carrinho;
import papelaria.model.Produto;
import papelaria.model.ProdutoPapelaria;
import papelaria.repository.PapelariaRepository;

public class PapelariaController implements PapelariaRepository {

	private Carrinho carrinho = new Carrinho();

	List<ProdutoPapelaria> lista = new ArrayList<ProdutoPapelaria>();

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

	
	@Override
	public void exibirTodosProdutos() {
		lista.stream().forEach(item -> System.out
				.println("ID: " + item.getId() + " - Produto: " + item.getNome() + " - Preço " + item.getPreco()));
	}

	@Override
	public ProdutoPapelaria selecionarProduto(int id) {
		ProdutoPapelaria produto = null;
		
		for(ProdutoPapelaria item : lista) {
			if(item.getId() == id) {
				produto = item;
			}
		}
		
		return produto;
	}

	@Override
	public void carrgarProdutos() {
		lista.add(new ProdutoPapelaria(1, "Caderno Espiral", 15.90, "Papel"));
		lista.add(new ProdutoPapelaria(2, "Caneta Esferográfica", 2.50, "Caneta"));
		lista.add(new ProdutoPapelaria(3, "Lápis Grafite", 1.20, "Lápis"));
		lista.add(new ProdutoPapelaria(4, "Bloco de Notas Adesivas", 5.90, "Papel"));
		lista.add(new ProdutoPapelaria(5, "Caneta Marcador", 3.50, "Marcador"));
		lista.add(new ProdutoPapelaria(6, "Apontador de Lápis", 1.80, "Acessório"));
		lista.add(new ProdutoPapelaria(7, "Borracha Branca", 0.90, "Acessório"));
		lista.add(new ProdutoPapelaria(8, "Corretivo em Fita", 4.30, "Acessório"));
		lista.add(new ProdutoPapelaria(9, "Tesoura Escolar", 6.50, "Acessório"));
		lista.add(new ProdutoPapelaria(10, "Régua 30cm", 2.00, "Acessório"));
		lista.add(new ProdutoPapelaria(11, "Estojo Escolar", 12.90, "Acessório"));
		lista.add(new ProdutoPapelaria(12, "Lápis de Cor 12 Cores", 8.90, "Lápis"));
		lista.add(new ProdutoPapelaria(13, "Grampeador Pequeno", 9.90, "Acessório"));
		lista.add(new ProdutoPapelaria(14, "Folhas Sulfite A4 100 unidades", 14.90, "Papel"));
		lista.add(new ProdutoPapelaria(15, "Marcador Permanente", 4.90, "Marcador"));
		lista.add(new ProdutoPapelaria(16, "Envelope Ofício", 1.00, "Papel"));
		lista.add(new ProdutoPapelaria(17, "Pasta Sanfonada", 7.50, "Organização"));
		lista.add(new ProdutoPapelaria(18, "Caderneta de Anotações", 6.90, "Papel"));
		lista.add(new ProdutoPapelaria(19, "Compasso Escolar", 5.80, "Acessório"));
		lista.add(new ProdutoPapelaria(20, "Marcador de Texto", 3.20, "Marcador"));
		lista.add(new ProdutoPapelaria(21, "Post-it 76x76mm", 5.00, "Papel"));
		lista.add(new ProdutoPapelaria(22, "Canetinhas Hidrocor 12 Cores", 9.90, "Caneta"));
		lista.add(new ProdutoPapelaria(23, "Caderno de Desenho", 10.50, "Papel"));

	}
}
