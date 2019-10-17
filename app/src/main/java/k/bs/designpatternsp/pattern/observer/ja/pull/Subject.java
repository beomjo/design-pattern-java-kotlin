package k.bs.designpatternsp.pattern.observer.ja.pull;

public interface Subject {
	public void add(Observer observer);
	public void remove(Observer observer);
	public void notifyObservers();
	public void notifyObserver(Observer observer);
}