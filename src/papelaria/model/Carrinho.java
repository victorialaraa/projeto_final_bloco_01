package papelaria.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Produto> itens;
	
	public Carrinho() {
		itens = new ArrayList<>();
	}
    
	public void adicionarProduto (Produto produto) {
		itens.add(produto);
		System.out.println(produto.getNome() + "foi adicionado ao carrinho. ");
	}
	
	public void exibirCarrinho() {
		if (itens.isEmpty()) {
			System.out.println("O carrinho está vazio.");
		} else {
			double total = 0;
			System.out.println("\n--- Itens no Carrinho ---");
			for (Produto produto : itens) {
				produto.exibirDetalhes();
				total += produto.getPreco();
			}
			System.out.println("Total: R$" + total);
		}
	}
	
	 public double calcularTotal() {
	        double total = 0;
	        for (Produto produto : itens) {
	            total += produto.getPreco();
	        }
	        return total;
	    }
	 
	 public void finalizarCompra() {
	        if (itens.isEmpty()) {
	            System.out.println("Não há itens no carrinho para finalizar a compra.");
	        } else {
	            double total = calcularTotal();
	            System.out.println("\nCompra finalizada!");
	            System.out.println("Total a pagar: R$ " + total);
	            System.out.println("Obrigado por comprar conosco!");
	            itens.clear(); 
	        }
	    }
	}

