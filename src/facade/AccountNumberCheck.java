package facade;

public class AccountNumberCheck {

	private int accountNumber = 123123123;

	
	public boolean accountActive( int accountNumberCheck ) {
		return accountNumberCheck == getAccountNumber();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
}
