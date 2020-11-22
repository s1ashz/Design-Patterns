package facade;

public class FundsCheck {

	private double cashInAccount = 1000;

	private void decreaseCashInAccount( double cashWithdrawn ) {
		cashInAccount -= cashWithdrawn;
	}
	
	private void increaseCashInAccount( double cashWithdrawn ) {
		cashInAccount += cashWithdrawn;
	}
	
	public boolean haveEnoughMoney( double cashToWithdrawal ) {
		boolean state = false;
		if ( cashToWithdrawal > getCashInAccount() ) {
			System.out.println("ERROR: You dont have enough money");
			System.out.println("Current Balance: " + getCashInAccount());
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Withdrawl Complete: Current Balance: " + getCashInAccount());
			state = true;
		}
		return state;
	}
	
	public void makeDeposite( double cashToDeposit ) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposite Complete: Current Balance: " + getCashInAccount());
	}
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	
}
