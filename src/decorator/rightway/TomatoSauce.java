package decorator.rightway;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce( Pizza newPizza ) {
		super( newPizza );
		
		System.out.println( "Adding Tomato Sauce..." );
	}

	public String getDescription() {
		System.out.println( "TomatoSauce" );
		return tempPizza.getDescription() + ", Tomato Sauce";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 1.00;
	}
	
}