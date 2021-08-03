package practical6GRADED;

public class CheckingAccount extends Account{
	
	private double overdraftLimit;
	
	public CheckingAccount() {
	}
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
		overdraftLimit = 1000.0;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLiit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public String toString() {
		return "Balance: " + getBalance() + ".";
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < - getOverdraftLimit()) {
			System.out.println("Cannot withdraw. Overdraft limit exceeded." + getBalance());
		}
		
		else {
			super.withdraw(amount);
		}
	}
}
