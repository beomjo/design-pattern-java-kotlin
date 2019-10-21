package k.bs.designpatternsp.behavioral.observer.ja.push;

public interface Subject {
	public void add(Observer observer);
	public void remove(Observer observer);
	public void notifyObservers();
}