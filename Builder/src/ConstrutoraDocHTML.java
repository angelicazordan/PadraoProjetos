
public class ConstrutoraDocHTML extends Construtora{

	@Override
	public void ConstruirTitulo(Documento doc) {
		resultado = "<html><head><title>" + doc.getTitulo() + "</title>" 
				  + "<meta charset='UTF-8'>"
				  + "<meta name='viewreport' content='width=device-whidth', initial-scale=1.0'>"
				  + "</head><body><div align='center'><p><font size='5'>"
				  + "<strong>" + doc.getTitulo() +"</strong></font><br>";
		
	}

	@Override
	public void ConstruirAutor(Documento doc) {
		resultado += "<strong>Autor: " + doc.getAutor() + "</strong><br>";
		
	}

	@Override
	public void ConstruirConteudo(Documento doc) {
		resultado += doc.getConteudo() + "</p><div></body></html>";
		
	}

}
