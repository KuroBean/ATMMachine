import java.math.BigDecimal;
public class BankAccount{
	private double balance;
	public BankAccount() {
		balance=0;
	}
	public BankAccount(double money) {
		balance=money;
	}
	public void deposit(double money) {
		//balance+=money;
		BigDecimal bigBalance=BigDecimal.valueOf(balance);
		BigDecimal bigDeposit=BigDecimal.valueOf(money);
		bigBalance=bigBalance.add(bigDeposit);
		balance=bigBalance.doubleValue();
	}
	public double getBalance() {
		return balance;
	}
	public void withDraw(double money) {
		BigDecimal bigBalance=BigDecimal.valueOf(balance);
		
		BigDecimal bigWithdraw=BigDecimal.valueOf(money);
		//System.out.println(bigWithdraw.toString());
		bigBalance=bigBalance.subtract(bigWithdraw);
		
		balance=bigBalance.doubleValue();
	}
	
}
