package decorator.rightway;

public class PizzaImpl implements Pizza {

	private String description = "Thin Dough";
	private double cost = 10.00;
	
	@Override
	public String getDescription() {
		System.out.println( "PizzaImpl" );
		return description;
	}

	@Override
	public double getCost() {
		return cost;
	}

}
