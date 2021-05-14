//esta é a classe contrutora que possui os métodos de construçao do do objeto complexo
public abstract class Construtora {
	
	protected String resultado;
	
  //estes metodos sao responsaveis pela contrsucao das partes do objeto complexo
 //	cada um deles sera particularizado nas classes que formatam o documento da maneira correta
	public abstract void ConstruirTitulo(Documento doc);
	
	public abstract void ConstruirAutor(Documento doc);
	
	public abstract void ConstruirConteudo(Documento doc);
	
	//metodo que exibe o resultado da construcao, nao necessitando de especializacao
	public String obterResultado(){
		return resultado;
	}
}
