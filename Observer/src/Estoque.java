import java.util.ArrayList;


public class Estoque implements Subject{
	private ArrayList observers;
	private Produto produto;
	private float qtdEstoque;
	
	public Estoque(){
		observers = new ArrayList();
	}

	public void registerObserver(Observer observador) {
		observers.add(observador);
		
	}

	public void removeObserver(Observer observador) {
		int i = observers.indexOf(observador);
		if (i >= 0){
			observers.remove(i);
		}
		
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++){
			Observer observer= (Observer) observers.get(i);
			observer.update(produto, qtdEstoque);
		}
		
	}
	
	public void estoqueAlterado(){
		notifyObserver();
	}
	
	public void setEstoque(Produto produto, float qtdEstoque){
		this.produto = produto;
		this.qtdEstoque =  qtdEstoque;
		estoqueAlterado();
	}
	
	

}
