import java.util.ArrayList;


public class ProdutosConsumo {
	
	private ArrayList<Produto> consumoList;
	
	public ProdutosConsumo(){
		consumoList = new ArrayList<Produto>();
		addProduto("Detergente", 0.50, "Limpeza");
		addProduto("Vassoura", 5.00, "Limpeza");
	}
	
	
	public void addProduto(String descricao, double preco, String setor){
		Produto prod = new Produto(descricao, preco, setor);
		consumoList.add(prod);
	}

}
