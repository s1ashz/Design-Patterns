package adapter;

public class EnemyAttackTest {

	
	public static void main( String[] args ) {
		
		EnemyAttacker tank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
		
		System.out.println("The Robot");
		robot.reactToHuman("paul");
		robot.walksForward();
		robot.smashWithHands();
		System.out.println();

		System.out.println("The EnemyTank");
		tank.assignDriver("Frank");
		tank.driveForward();
		tank.fireWeapon();
		System.out.println();
		
		System.out.println("The Robot with Adapter");
		robotAdapter.assignDriver("Andre");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}
	
}
