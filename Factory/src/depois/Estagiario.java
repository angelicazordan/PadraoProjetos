package depois;

public class Estagiario extends Funcionario{
	
	public Estagiario(){
		salario = new SalarioPorHora();
		ferias = new ComFerias();
	}

}
