package observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private List<Observer> observers;
	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	public StockGrabber() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf( deleteObserver );
		observers.remove( observerIndex );
		
		System.out.println( "Observer " + (observerIndex + 1) + " deleted." );
	}

	@Override
	public void notifyObserver() {
		for ( Observer obs : observers ) {
			obs.update(ibmPrice, applPrice, googPrice);
		}
	}

	@Override
	public void updateImb(double price) {
		this.ibmPrice = price;
		notifyObserver();		
	}

	@Override
	public void updateAppl(double price) {
		this.applPrice = price;
		notifyObserver();		
	}

	@Override
	public void updateGoog(double price) {
		this.googPrice = price;
		notifyObserver();		
	}

	
	
}
