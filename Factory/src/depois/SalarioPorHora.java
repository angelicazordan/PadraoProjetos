package depois;

public class SalarioPorHora implements Salario{
	
	public void calcularSalario() {
		System.out.println("Sal�rio por Hora.");
		SingletonLog.getInstance().doLog("Houve um c�lculo de sal�rio por hora.");
	}

}
