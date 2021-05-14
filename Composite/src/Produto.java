
public class Produto extends ComponentesSetor{
	
	private String descricao;
	private double preco;
	private String setor;
	
	public Produto(String descricao, double preco, String setor){
		this.descricao = descricao;
		this.preco = preco;
		this.setor = setor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void print(String id){
		System.out.println(id+getDescricao());
	}
	

}
