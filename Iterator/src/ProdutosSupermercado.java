import java.util.ArrayList;


public class ProdutosSupermercado {
	
	private ArrayList<Produto> produtosList;
	
	public ProdutosSupermercado(){
		produtosList = new ArrayList<Produto>();
		addProduto("Alface", 3.99);
		addProduto("Agrião", 2.50);
		addProduto("Laranja", 2.80);
		addProduto("Maçã", 4.70);
		addProduto("Tomate", 6.75);
	}
	
	public void addProduto(String descricao, double preco){
		Produto produto = new Produto(descricao, preco);
		produtosList.add(produto);
	}
	
	public ArrayList<Produto> getProdutos(){
		return produtosList;
	}
	
	public Iterator createIterator(){
		return new SupermercadoIterator(produtosList);
	}

}
