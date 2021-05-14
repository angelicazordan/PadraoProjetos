
public class Main {
	
	public static void main(String[] args){
		
		Relatorio relatorio = new Relatorio();
		relatorio.ImprimeProdutos(new ProdutosCafeteria().createIterator(), "PRODUTOS DA CAFETERIA");
		relatorio.ImprimeProdutos(new ProdutosSupermercado().createIterator(), "PRODUTOS DO SUPERMERCADO");
		//relatorio.ImprimeProdutos(new ProdutosConsumo().createIterator(), "PRODUTOS DE CONSUMO");
		
		System.out.println("---------------------------");
		
		//relatório gerado no padrao composite
		relatorio.imprimeSetoresSupermercado(new ProdutosSupermercado().createIterator());
		System.out.println("---------------------------");
	}

}
