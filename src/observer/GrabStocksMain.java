package observer;

public class GrabStocksMain {

	public static void main( String[] args ) {
		
		Subject stockGrabber = new StockGrabber();
		Observer observer1 = new StockObserver( stockGrabber );
		Observer observer2 = new StockObserver( stockGrabber );
		
		stockGrabber.updateImb(197.00);
		stockGrabber.updateAppl(677.40);
		stockGrabber.updateGoog(676.40);
		
		stockGrabber.unregister(observer1);

		
//		stockGrabber.setIbmPrice(12.00);
//		stockGrabber.setApplPrice(15.40);
//		stockGrabber.setGoogPrice(19.40);
	}
	
	
}
