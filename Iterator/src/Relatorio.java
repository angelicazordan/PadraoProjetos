
public class Relatorio {
	
	public void ImprimeProdutos(Iterator iterator, String descricao){
		System.out.println("======"+descricao+"======");
		while (iterator.hasNext()){
			Produto produto = (Produto) iterator.next();
			System.out.println(produto.getDescricao() + ": " + produto.getPreco());
		}
	}

}
