package depois;

public class SemSalario implements Salario {

    @Override
    public void calcularSalario() {
        System.out.println("Sem salário");
        SingletonLog.getInstance().doLog("Houve uma tentativa de cáculo para funcionário sem salário.");
    }
    
}
