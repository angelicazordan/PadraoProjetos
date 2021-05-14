package antes;

public class Main {
	
	public static void main(String[] args){
		Funcionario e = new Estagiario();
		Funcionario c = new Contratado();
		
		e.calcularSalario();
		c.calcularSalario();
		
	}

}
