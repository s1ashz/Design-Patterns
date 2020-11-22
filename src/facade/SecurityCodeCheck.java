package facade;

public class SecurityCodeCheck {

	private int securityCode = 1234;
	
	public boolean isSecurityCode( int securityCodeCheck ) {
		return securityCodeCheck == getSecurityCode();
	}

	public int getSecurityCode() {
		return securityCode;
	}
	
	
	
}
