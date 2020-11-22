package decorator.rightway;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;
	
	public ToppingDecorator( Pizza newPizza ) {
		this.tempPizza = newPizza;
	}
	
	public String getDescription() {
		System.out.println( "ToppingDecorator" );
		return tempPizza.getDescription();
	}
	
	public double getCost() {
		return tempPizza.getCost();
	}
}
