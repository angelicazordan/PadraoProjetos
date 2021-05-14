
public class PessoaDAO {
	
	public static Subject getPessoaByID(String id){
		System.out.println("Select * from pessoa where id=" +id);
		return new RealSubject(id, "Pessoa " + id);
	}

}
