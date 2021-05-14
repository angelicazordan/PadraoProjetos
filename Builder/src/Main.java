
public class Main {
	
	//esta é a classe diretora
	protected static void construir(Construtora cons, Documento doc){
		//método construir, irá construis as partes do objeto complexo
		cons.ConstruirTitulo(doc);
		cons.ConstruirAutor(doc);
		cons.ConstruirConteudo(doc);
	}
	
	public static void main(String[] args){
		//1- Instanciar nossos 2 tipos de contrutora
		Construtora consDocComum = new ConstrutoraDocComum();
		Construtora consDocHTML = new ConstrutoraDocHTML();
		
		//2- inicializar o objeto completo, passando suas partes como parametro
		Documento doc = new Documento("Padrão Builder", "PP2019", "Escrevendo uma construtora");
		
		//3- Construir o doc do primeiro tipo, sem formatacao
		construir(consDocComum, doc);
		
		//4- Construir o doc do segundo tipo, com formatacao HTML
		construir(consDocHTML, doc);
		
		//5- exibir os resultados obtidos com as duas formatacoes
		System.out.println(consDocComum.obterResultado());
		System.out.println(consDocHTML.obterResultado());
	}

}
