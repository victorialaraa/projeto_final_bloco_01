package papelaria.repository;

import java.util.List;

import papelaria.model.Produto;
import papelaria.model.ProdutoPapelaria;

public interface PapelariaRepository {

	public void exibirCarrinho(); 
	public void adicionarNoCarrinho(Produto produto);
	public void exibirTotal(); 
	public void finalizarPagamento();
	public List<ProdutoPapelaria> listaProdutos();
}
