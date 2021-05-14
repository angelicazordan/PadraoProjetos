
public class ProdutosCafeteria {
	
	private static final int MAX_PRODUTOS = 5;
	private int index = 0;
	private Produto[] lanches;
	
	public ProdutosCafeteria(){
		lanches = new Produto[MAX_PRODUTOS];
		addProduto("Café", 1.00, "Bebidas");
		addProduto("Pão de queijo", 2.00, "Salgados");
		addProduto("Sanduiche", 4.50,"Salgados" );
		addProduto("Pastel", 2.50, "Salgados");
		addProduto("Bolo", 3.45, "Doces");
	}
	
	public void addProduto(String descricao, double preco, String setor){
		Produto produto = new Produto(descricao, preco, setor);
		
		if (index < MAX_PRODUTOS){
			lanches[index] = produto;
			index++;
		}
	}
	
	public Produto[] getProdutos(){
		return lanches;
	}
	
	public Iterator createIterator(){
		return new CafeteriaIterator(lanches);
	}

}
