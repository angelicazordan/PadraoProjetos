import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] args){
	  List<Subject> pessoas = new ArrayList<Subject>();	
	  
	  pessoas.add(new Proxy("A"));
	  pessoas.add(new Proxy("B"));
	  pessoas.add(new Proxy("C"));
	  pessoas.add(new Proxy("D"));
	  
	  //para estes dois casos, a pesquisa sera realizada
	  //de forma completa no banco de dados
	  System.out.println("1 - Nome: " + pessoas.get(0).getNome());
	  System.out.println("2 - Nome: " + pessoas.get(1).getNome());
	  
	  //esta pessoa já foi bucada, entao vai apenas retornar do cache
	  System.out.println("3 - Nome: " + pessoas.get(0).getNome());
	  
	  //a terceira pessoa nunca será consultada no banco de dados
	  //hibernate adota uma postura para performance - lazy loading
	  
	  //podemos imprimir o id do objeto, o proxy nao sera inicializado
	  
	  System.out.println("4 - O id da terceira pessoa é - " +
	  pessoas.get(2).getID());
	  
	  System.out.println("5 - O id da terceira pessoa é - " +
			  pessoas.get(3).getID());
	}

}
