package practical6GRADED;

public class testAccount {
	public static void main (String[] args) {
		//creating new Account object
		Account bobRoss = new Account(101, 20000);
		Account.setAnnualInterestRate(0.045);
		bobRoss.withdraw(2500);
		bobRoss.deposit(3000);
		
		//expected outcome: balance(20,500), monthly interest amount(76.875), date created(march 22, 2021)
		System.out.println("The balance of Bob Ross' account(after the transactions) is: $" + bobRoss.getBalance());
		System.out.println("The monthly interest of his account is: $" + bobRoss.getMonthlyInterest());
		System.out.println("The date his account was created: " + bobRoss.getDateCreated());
		
		//testing toString() method
//		System.out.print("\n" + bobRoss.toString());
		
		//testing get annual interest rate
//		System.out.println("\n" + bobRoss.getAnnualRate());
		
		//testing get id
//		System.out.print("\n" + bobRoss.getId());
	}
}
