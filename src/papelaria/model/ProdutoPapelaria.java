package papelaria.model;

public class ProdutoPapelaria extends Produto {
	    private String tipoMaterial;

	    public ProdutoPapelaria(int id, String nome, double preco, String tipoMaterial) {
	        super(id, nome, preco);
	        this.tipoMaterial = tipoMaterial;
	    }

	    public String getTipoMaterial() {
	        return tipoMaterial;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", Preço: R$ " + getPreco() + ", Tipo: " + tipoMaterial);
	   }
}


