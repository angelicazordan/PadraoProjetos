
public interface Subject {
	public void registerObserver(Observer observador);
	public void removeObserver(Observer observador);
	public void notifyObserver();

}
