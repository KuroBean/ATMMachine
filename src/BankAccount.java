
public class BankAccount{
	private double balance;
	public BankAccount() {
		balance=0;
	}
	public void deposit(double money) {
		balance+=money;
	}
	public double getBalance() {
		return balance;
	}
	public void withDraw(double money) {
		balance-=money;
	}
	
}