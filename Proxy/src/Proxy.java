
public class Proxy implements Subject {
	private String id;
	
	private Subject pessoa;
	
	public Proxy(String nome){
		this.id = nome;
	}

	@Override
	public String getNome() {
		if (pessoa == null){
			//cria o objeto da pessoa apenas quando chamar este metodo
			pessoa = PessoaDAO.getPessoaByID(this.id);
		}
		return pessoa.getNome();
	}

	@Override
	public String getID() {		
		return this.id;
	}

}
