package depois;

public class Main {
	
	public static void main(String[] args){
		 Funcionario c = new Contratado();
	        System.out.println("Contratado:");
	        c.calcularSalario();
	        c.calcularFerias();
	        
	        Funcionario e = new Estagiario();
	        System.out.println("Estagiário:");
	        e.calcularSalario();
	        e.calcularFerias();
	        
	        Funcionario v = new Voluntario();
	        System.out.println("Voluntário:");
	        v.calcularSalario();
	        v.calcularFerias();
	        
	        Funcionario ve = new Vendedor();
	        System.out.println("Vendedor:");
	        ve.calcularSalario();
	        ve.calcularFerias();
	        
	        Funcionario t = new Terceirizado();
	        System.out.println("Terceirizado:");
	        t.calcularSalario();
	        t.calcularFerias();
		
	}

}
