
public class ProdutosCafeteria {
	
	private static final int MAX_PRODUTOS = 5;
	private int index = 0;
	private Produto[] lanches;
	
	public ProdutosCafeteria(){
		lanches = new Produto[MAX_PRODUTOS];
		addProduto("Café", 1.00);
		addProduto("Pão de queijo", 2.00);
		addProduto("Sanduiche", 4.50);
		addProduto("Pastel", 2.50);
		addProduto("Bolo", 3.45);
	}
	
	public void addProduto(String descricao, double preco){
		Produto produto = new Produto(descricao, preco);
		
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
