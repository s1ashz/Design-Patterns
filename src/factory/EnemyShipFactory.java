package factory;

public class EnemyShipFactory {

	public static EnemyShip makeEnemyShip(String newShipType) {
		if ( newShipType.equals("U") ) {
			return new UFOEnemyShip();
		} else if ( newShipType.equals("R") ) {
			return new RocketEnemyShip();
		} else if ( newShipType.equals("B")) {
			return new BigUFOEnemyShip();
		} else {
			System.out.println("Invalid Ship");
			return null;
		}
	}
	
}
