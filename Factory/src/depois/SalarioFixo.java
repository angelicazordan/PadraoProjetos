package depois;

public class SalarioFixo implements Salario{

	public void calcularSalario() {
		System.out.println("Sal�rio Fixo.");
		SingletonLog.getInstance().doLog("Houve um c�lculo de sal�rio fixo");
		
	}

}
