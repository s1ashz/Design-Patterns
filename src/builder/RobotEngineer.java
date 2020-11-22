package builder;

public class RobotEngineer {

	private RobotBuilder robotBuilder;
	
	public RobotEngineer() {
		this.robotBuilder = new OldRobotBuilder();;
	}

	public Robot getRobot() {
		return robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}
