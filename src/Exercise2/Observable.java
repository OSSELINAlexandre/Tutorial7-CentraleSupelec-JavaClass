package Exercise2;

public interface Observable {

	void addObserver(Observer obs);
	void removeObserver(Observer obs);
	void notifyAllObserver();
	void sendMessageToObserved(String msg, Observer Obs);

	
	//notifyAll is a method from the Object class
}
