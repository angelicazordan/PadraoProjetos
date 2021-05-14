
public class LigarAlarmeCommand implements Command{
	
	Alarme alarme;
	
	public LigarAlarmeCommand(Alarme alarme){
		this.alarme = alarme;
	}

	public void execute() {
		alarme.ativar();
		
	}

	public void undo() {
		alarme.desativar();
		
	}
	
	

}
