package decorator.rightway;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella( Pizza newPizza ) {
		super( newPizza );
		
		System.out.println( "Adding Dough..." );
		
		System.out.println( "Adding Mozzarella..." );
		
		
	}

	public String getDescription() {
		System.out.println( "Mozzarella" );
		return tempPizza.getDescription() + ", Mozzarella";
	}
	
	public double getCost() {
		return tempPizza.getCost() + .50;
	}
	
}
