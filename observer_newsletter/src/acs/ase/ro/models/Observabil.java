package acs.ase.ro.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
	
	private List<Observer> observers = new ArrayList<>();
	
	public void subscribe(Observer observer) {
		observers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.notifyMe(this);
		}
	}
	
	
}
