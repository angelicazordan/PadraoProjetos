import java.util.ArrayList;


public class ProdutosSupermercado {
	
	private ArrayList<Produto> produtosList;
	
	public ProdutosSupermercado(){
		produtosList = new ArrayList<Produto>();
		addProduto("Alface", 3.99, "Verduras");
		addProduto("Agrião", 2.50, "Verduras");
		addProduto("Laranja", 2.80, "Frutas");
		addProduto("Maçã", 4.70, "Frutas");
		addProduto("Tomate", 6.75, "Orgânicos");
	}
	
	public void addProduto(String descricao, double preco, String setor){
		Produto produto = new Produto(descricao, preco, setor);
		produtosList.add(produto);
	}
	
	public ArrayList<Produto> getProdutos(){
		return produtosList;
	}
	
	public Iterator createIterator(){
		return new SupermercadoIterator(produtosList);
	}

}
