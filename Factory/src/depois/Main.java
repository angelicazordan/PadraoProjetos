package depois;

public class Main {
	
	public static void main(String[] args){
		
		FuncionarioFactory fabrica = new FuncionarioFactoryConcreto();
		
		Funcionario estagiario = fabrica.fazerPagamento("ESTAGIARIO");
		Funcionario contratado = fabrica.fazerPagamento("CONTRATADO");
		Funcionario vendedor = fabrica.fazerPagamento("VENDEDOR");
		Funcionario voluntario = fabrica.fazerPagamento("VOLUNTARIO");
		Funcionario terceirizado = fabrica.fazerPagamento("TERCEIRIZADO");
	}

}
