package strategy;

public abstract class Animal {

	private Fly flyingType;
	private String name;
	
	
	public Fly getFlyingType() {
		return flyingType;
	}
	public void setFlyingType(Fly flyingType) {
		this.flyingType = flyingType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void fly() {
		flyingType.fly();
	}
	
}
