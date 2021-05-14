package depois;



public class SalarioPorComissao implements Salario {

    @Override
    public void calcularSalario() {
        System.out.println("Salário por comissão");
        SingletonLog.getInstance().doLog("Houve um cálculo de salário por comissão.");

    }
    
}
