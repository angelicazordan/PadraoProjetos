package depois;

public class Voluntario extends Funcionario {
    
    public Voluntario() {
        salario = new SemSalario();
        ferias = new SemFerias();
    }
    
}
