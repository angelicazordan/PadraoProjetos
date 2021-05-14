
public class RealSubject implements Subject{
	private String nome;
	private String id;
	
	public RealSubject(String id, String nome){
		this.id = id;
		this.nome = nome;
		
		//simulando que retornou o registro do banco de dados
		System.out.println("Retornou a pessoa do banco de dados --->" 
		+ nome);
	}

	@Override
	public String getNome() {		
		return this.nome;
	}

	@Override
	public String getID() {
		return this.id;
	}
	

}
