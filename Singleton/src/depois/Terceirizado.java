package depois;

public class Terceirizado extends Funcionario {
    
    public Terceirizado() {
        salario = new SalarioPorHora();
        ferias = new SemFerias();
    }
    
}
