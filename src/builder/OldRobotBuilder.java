package builder;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;

	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead( "Tin head" );
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Blowtorch Arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Roller Skates");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

	
}
