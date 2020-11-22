package facade;

public class TestBanckAccount {

	public static void main( String[] args ) {
		BankAccountFacade accessingBank = new BankAccountFacade(123123123, 1234);
	
		accessingBank.withdrawCash(50.00);
		accessingBank.withdrawCash(900.00);
		accessingBank.withdrawCash(2000.00);
		
		accessingBank.depositCash( 500.00 );
		
	}
	
}
