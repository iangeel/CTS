package ro.acs.ase.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	private List<Observer> observers = new ArrayList<>();
	
	public void addObservertor(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObservator(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.notifyMe(this);
		}
	}
}
