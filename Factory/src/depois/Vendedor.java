package depois;

public class Vendedor extends Funcionario {
    
    public Vendedor() {
        salario = new SalarioPorComissao();
        ferias = new ComFerias();
    }
    
}
