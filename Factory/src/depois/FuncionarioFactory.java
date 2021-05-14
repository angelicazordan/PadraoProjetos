package depois;

public abstract class FuncionarioFactory {
	
	protected abstract Funcionario createFuncionario(String tipo);
	
	public Funcionario fazerPagamento(String tipo){
		Funcionario funcionario = createFuncionario(tipo);
		funcionario.calcularSalario();
		funcionario.calcularFerias();
		return funcionario;
	}

}
