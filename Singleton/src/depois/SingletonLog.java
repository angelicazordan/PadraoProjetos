package depois;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Calendar;

public class SingletonLog {
	private int contador = 0; //contador de vezes que o objeto foi criado

	private static SingletonLog instancia; //objeto com acesso privado
	
	//construtor privado
	//somente ele pode acessar o objeto para criacao
	private SingletonLog(){
	//o construtor é criado para sobrescrever o construtor padrao do java, que é publico
	//todas as vezes que o método de criaçao for chamado, geramos um incremento no contador	
		this.setContador(this.getContador() + 1);
	}
	
	public static SingletonLog getInstance(){
	//método que retorna a instancia única da classe SingletonLog
		if (instancia == null) {
			instancia = new SingletonLog();			
		}
		return instancia;
	}
	
	//Processo que faz a gravacao do log dos eventos da aplicacao
	public void doLog(String descricaoEvento){
		File arquivo = new File(System.getProperty("user.dir") + 
				"/src/depois/Operacoes.log");
		
		try{
			FileWriter grava = new FileWriter(arquivo, true);
			PrintWriter escreve = new PrintWriter(grava);
			
			escreve.println(Calendar.getInstance().getTime() + " - " + descricaoEvento);
			escreve.close();
			grava.close();
			
			//provando que o contador nunca será maior que 1
			System.out.println("Número de instancias que foram geradas para o log (SilgetonLog): " +
			this.getContador());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	

}
