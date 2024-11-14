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
	}
	
	public List<Produto> getList() {
		return itens;
	}
	
	public void adicionar() {
		// Remover depois
        itens.add(new ProdutoPapelaria(1, "Caderno Espiral", 15.90, "Papel"));
        itens.add(new ProdutoPapelaria(2, "Caneta Esferográfica", 2.50, "Caneta"));
        itens.add(new ProdutoPapelaria(3, "Lápis Grafite", 1.20, "Lápis"));
	}
	
    
//	public void adicionarProduto (Produto produto) {
//		itens.add(produto);
//		System.out.println(produto.getNome() + "foi adicionado ao carrinho. ");
//	}
//	

//	
//	 public double calcularTotal() {
//	        double total = 0;
//	        for (Produto produto : itens) {
//	            total += produto.getPreco();
//	        }
//	        return total;
//	    }
//	 
////	 public void finalizarCompra() {
//	        if (itens.isEmpty()) {
//	            System.out.println("Não há itens no carrinho para finalizar a compra.");
//	        } else {
//	            double total = calcularTotal();
//	            System.out.println("\nCompra finalizada!");
//	            System.out.println("Total a pagar: R$ " + total);
//	            System.out.println("Obrigado por comprar conosco!");
//	            itens.clear(); 
//	        }
//	    }
	}

