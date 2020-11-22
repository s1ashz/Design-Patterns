package facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck accChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade( int newAccNum, int newSecCode) {
		this.accountNumber = newAccNum;
		this.securityCode = newSecCode;
		
		this.bankWelcome = new WelcomeToBank();
		this.accChecker = new AccountNumberCheck();
		this.codeChecker = new SecurityCodeCheck();
		this.fundChecker = new FundsCheck();
	}

	public void withdrawCash(double cashToGet) {
		if ( validateCashWithdrawl(cashToGet) ) {
			checkEnoughMoneyAndWithdrawl(cashToGet);
			System.out.println("Transaction Completed\n");
		} else {
			System.out.println("Transaction Failed\n");
		}
	}

	private boolean validateCashWithdrawl(double cashToGet) {
		return checkAccountIsActive() && checkSecurityCode();
	}

	private boolean checkEnoughMoneyAndWithdrawl(double cashToGet) {
		return fundChecker.haveEnoughMoney(cashToGet);
	}

	private boolean checkSecurityCode() {
		return codeChecker.isSecurityCode(getSecurityCode());
	}

	private boolean checkAccountIsActive() {
		return accChecker.accountActive(getAccountNumber());
	}

	public void depositCash(double cashToDeposit) {
		if ( checkAccountIsActive() &&
				checkSecurityCode() ) {
			
			fundChecker.makeDeposite(cashToDeposit);
			System.out.println("Transaction Completed\n");
		} else {
			
			System.out.println("Transaction Failed\n");
		}
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	
	
}
