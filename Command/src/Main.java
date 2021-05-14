
public class Main {
	
	
	
	public static void main(String[] args){
		
		ControleRemoto controle;
		controle = new ControleRemoto();
		Alarme alarme = new Alarme();
		controle.setCommand(0, new LigarAlarmeCommand(alarme), new DesligaAlarmeCommand(alarme));
	    System.out.println(controle);
	    
	    controle.ligar(0);
	    controle.desligar(0);
	    
	}

}
