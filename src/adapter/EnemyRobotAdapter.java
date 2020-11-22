package adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot enemyRobot = new EnemyRobot();

	public EnemyRobotAdapter( EnemyRobot robot ) {
		this.enemyRobot = robot;
	}
	
	@Override
	public void fireWeapon() {
		enemyRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		enemyRobot.walksForward();
	}

	@Override
	public void assignDriver(String driverName) {
		enemyRobot.reactToHuman(driverName);
	}
	
}
