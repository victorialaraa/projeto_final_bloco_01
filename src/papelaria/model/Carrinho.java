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
	
 
	}

