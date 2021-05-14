
public class Main {
	
	public static void main(String[] args){
		
		Relatorio relatorio = new Relatorio();
		relatorio.ImprimeProdutos(new ProdutosCafeteria().createIterator(), "PRODUTOS DA CAFETERIA");
		relatorio.ImprimeProdutos(new ProdutosSupermercado().createIterator(), "PRODUTOS DO SUPERMERCADO");
		
		System.out.println("---------------------------");
		
		
		
		System.out.println("======================OBSERVER======================");
		Estoque estoque = new Estoque();
		EstoqueAtual estoqueAtual = new EstoqueAtual(estoque);
		Produto prod = new Produto("Feijão", 4);
		estoque.setEstoque(prod, 10);
		estoque.setEstoque(prod, 5);
		estoque.setEstoque(prod, 1);
	}

}
