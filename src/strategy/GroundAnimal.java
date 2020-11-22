package strategy;

public class GroundAnimal implements Fly {

	@Override
	public void fly() {
		System.out.println( "NOPE, I CANNOT FLY");
	}
	
}
