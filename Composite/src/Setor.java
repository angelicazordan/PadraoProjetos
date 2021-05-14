import java.util.ArrayList;


public class Setor extends ComponentesSetor{
	
	String descricao;
	ArrayList<ComponentesSetor> componentes = new ArrayList<ComponentesSetor>();
	
	public Setor(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void add(ComponentesSetor componente){
		componentes.add(componente);
	}
	
	public void remove(ComponentesSetor componente){
		componentes.remove(componente);
	}
	
	public ComponentesSetor getChild(int i){
		return (ComponentesSetor) componentes.get(i);
	}
	
	public void print(String id){
		System.out.println(id+getDescricao());
		id += "-";
		for (ComponentesSetor c: componentes){
			c.print(id);
		}
	}

}
