package factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		createEnemyShip();
		createEnemyShip();
		createEnemyShip();
		
	}

	private static void createEnemyShip() {
		EnemyShip theEnemy = null;
		System.out.println("What type of ship? (U / R / B)\n");
		Scanner userInput = new Scanner(System.in);
		
		if (userInput.hasNextLine()) {
			String enemyShipOption = userInput.nextLine();
			theEnemy = EnemyShipFactory.makeEnemyShip(enemyShipOption);
		}
		
		if ( null != theEnemy ) doStuffEnemy(theEnemy);
	}

	private static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayHeroShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
	
}
