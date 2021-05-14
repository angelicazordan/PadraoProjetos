
public class Main {
	
	public static void main(String[] args){
		
		Relatorio relatorio = new Relatorio();
		relatorio.ImprimeProdutos(new ProdutosCafeteria().createIterator(), "PRODUTOS DA CAFETERIA");
		relatorio.ImprimeProdutos(new ProdutosSupermercado().createIterator(), "PRODUTOS DO SUPERMERCADO");
		
		System.out.println("---------------------------");
	}

}
