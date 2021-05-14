
public class DesligaAlarmeCommand implements Command{
	
Alarme alarme;
	
	public DesligaAlarmeCommand(Alarme alarme){
		this.alarme = alarme;
	}

	public void execute() {
		alarme.desativar();;
		
	}

	public void undo() {
		alarme.ativar();
		
	}
	

}
