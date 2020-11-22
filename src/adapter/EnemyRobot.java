package adapter;

import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot Causes " + attackDamage + " dmg with his hands");
	}
	
	public void walksForward() {
		int movement =  generator.nextInt(5) + 1;
		System.out.println( "Enemy Robot walks forward " + movement + " spaces" );
	}

	public void reactToHuman( String driverName ) {
		System.out.println( "Enemy Robot Tramps on " + driverName );
	}
	
}
