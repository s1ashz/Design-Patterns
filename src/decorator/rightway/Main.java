package decorator.rightway;

public class Main {

	public static void main( String[] args ) {
		
		Pizza pizza = new TomatoSauce( new Mozzarella( new PizzaImpl() ) );
		System.out.println( "-----" );
		System.out.println( pizza.getDescription() );
		System.err.println( pizza.getCost() );
		
	}
	
}
