package depois;

public class SalarioFixo implements Salario{

	public void calcularSalario() {
		System.out.println("Salário Fixo.");
		SingletonLog.getInstance().doLog("Houve um cálculo de salário fixo");
		
	}

}
