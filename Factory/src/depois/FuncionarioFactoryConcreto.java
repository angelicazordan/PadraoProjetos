package depois;

public class FuncionarioFactoryConcreto extends FuncionarioFactory{

	
	protected Funcionario createFuncionario(String tipo) {
		if ("ESTAGIARIO".equals(tipo)){
			return new Estagiario();
		}else if ("CONTRATADO".equals(tipo)){
			return new Contratado();
		}else if ("VENDEDOR".equals(tipo)){
			return new Vendedor();
		}else if ("TERCEIRIZADO".equals(tipo)){
			return new Terceirizado();
		}else if ("VOLUNTARIO".equals(tipo)){
			return new Voluntario();
		}
		return null;
	}
	
	

}
