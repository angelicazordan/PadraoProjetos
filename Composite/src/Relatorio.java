
public class Relatorio {
	
	public void ImprimeProdutos(Iterator iterator, String descricao){
		System.out.println("======"+descricao+"======");
		while (iterator.hasNext()){
			Produto produto = (Produto) iterator.next();
			System.out.println(produto.getDescricao() + ": " + produto.getPreco());
		}
	}
	
	public void imprimeSetoresSupermercado(Iterator iterator){
		ComponentesSetor setores = new Setor("SETORES DO SUPERMERCADO");
		ComponentesSetor frutas = new Setor("FRUTAS");
		ComponentesSetor verduras = new Setor("VERDURAS");
		ComponentesSetor organicos = new Setor("ORGÂNICOS");
		
		while (iterator.hasNext()){
			Produto produto = (Produto) iterator.next();
			if ("Frutas".equals(produto.getSetor())){
				frutas.add(produto);
			}else if ("Verduras".equals(produto.getSetor())){
				verduras.add(produto);
			}else if ("Orgânicos".equals(produto.getSetor())){
				organicos.add(produto);
		    }else {
		    	setores.add(produto);
		    }
	     }
		
		setores.add(frutas);
		setores.add(verduras);
		verduras.add(organicos);
		
		setores.print("-");
	}

}
