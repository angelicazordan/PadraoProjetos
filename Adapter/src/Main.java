
public class Main {
	
	public static void main(String[] args){
		Conta cc = new ContaCorrente();
		Conta cs = new ContaSalario();
		Conta cp = new PoupancaAdapter(new ContaPoupanca());
		
		cc.getSaldo();
		cs.getSaldo();
		cp.getSaldo();
	}

}
