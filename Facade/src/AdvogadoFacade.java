
public class AdvogadoFacade {
	
	public static final int  CRIMINAL = 0;
	public static final int CIVIL = 1;
	
	public Processo getProcesso(int tipo){
		switch (tipo){
		case CRIMINAL:
			Justica justicaCriminal = new JusticaCriminal();
			return justicaCriminal.getprProcesso();
		case CIVIL:
			Justica justicaCivil = new JusticaCivil();
			return justicaCivil.getprProcesso();
		default:
			return null;
		}
	}

}
