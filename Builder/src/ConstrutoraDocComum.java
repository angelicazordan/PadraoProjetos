//esta classe é derivada da construtora, especializando seus metodos
public class ConstrutoraDocComum extends Construtora{

	@Override
	public void ConstruirTitulo(Documento doc) {
		resultado = doc.getTitulo() + "\n";
		
	}

	@Override
	public void ConstruirAutor(Documento doc) {
		resultado += doc.getAutor() + "\n";
		
	}

	@Override
	public void ConstruirConteudo(Documento doc) {
		resultado += doc.getConteudo() + "\n";
		
	}

}
