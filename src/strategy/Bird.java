package strategy;

public class Bird extends Animal {

	public Bird() {
		this.setFlyingType( new AirAnimal());
		this.setName("birdie");
	}
	
}
