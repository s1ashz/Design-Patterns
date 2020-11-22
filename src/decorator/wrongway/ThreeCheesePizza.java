package decorator.wrongway;

public class ThreeCheesePizza extends Pizza {

	@Override
	public void setDescription( String newDescription ) {
		
	}

	@Override
	public String getDescription() {
		return "Mozzarella, Fontina, Parmesan, Cheese Pizza";
	}

	@Override
	public double getCost() {
		return 10.00;
	}

	@Override
	public boolean hasFontina() {
		return false;
	}

}
