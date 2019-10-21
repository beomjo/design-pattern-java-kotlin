package k.bs.designpatternsp.behavioral.observer.ja.pull;

public interface Subject {
	public void add(Observer observer);
	public void remove(Observer observer);
	public void notifyObservers();
	public void notifyObserver(Observer observer);
}