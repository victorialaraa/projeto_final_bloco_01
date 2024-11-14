package papelaria.repository;

import papelaria.model.Produto;

public interface PapelariaRepository {

	public void exibirCarrinho(); 
	public void adicionarNoCarrinho(Produto produto);
}
