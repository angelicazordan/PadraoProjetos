package depois;

public class SalarioPorHora implements Salario{
	
	public void calcularSalario() {
		System.out.println("Salário por Hora.");
		SingletonLog.getInstance().doLog("Houve um cálculo de salário por hora.");
	}

}
