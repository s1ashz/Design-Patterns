package observer;

public interface Subject {

	void register( Observer o );
	void unregister( Observer o );
	void notifyObserver();
	void updateImb( double price );
	void updateAppl( double price );
	void updateGoog( double price );
		
}
