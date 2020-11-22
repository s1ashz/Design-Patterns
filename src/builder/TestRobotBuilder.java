package builder;

public class TestRobotBuilder {

	public static void main(String[] args) {

		RobotEngineer engineer1 = new RobotEngineer();
		RobotEngineer engineer2 = new RobotEngineer();
		
		engineer1.makeRobot();
		engineer2.makeRobot();
		
		System.out.println(engineer1.getRobot());
		System.out.println(engineer2.getRobot());
	}
	
	
}
