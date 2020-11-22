package strategy;

public class Dog extends Animal {

	public Dog() {
		this.setFlyingType(new GroundAnimal());
		this.setName("piruças");
	}
	
}
