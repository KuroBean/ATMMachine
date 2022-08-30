import java.util.*;

public class ATM {
	private Integer id;
	private BankAccount openedAcc;
	public HashMap<Integer,BankAccount> accounts=new HashMap<Integer,BankAccount>();
	public ATM() {
		
	}
	public void openAccount(Integer accNumber ) {
		openedAcc=accounts.get(accNumber);
	}
	public void openAccount(Integer accNumber, double deposit ) {
		openedAcc=accounts.get(accNumber);
		openedAcc.deposit(deposit);
	}
	public void closeAccount(Integer accNumber) {
		try {
			if(openedAcc.getBalance()==0) {
			openedAcc=null;
			}
		}catch(Exception e) {
			System.out.println("no account opened");
		}
		
	}
	public double checkBalance(Integer accNumber) {
		if(openedAcc==null) {
			return 0.0;
		}else {
			return openedAcc.getBalance();
		}
	}
	public boolean depositMoney() {
		
	}
	
	
}
