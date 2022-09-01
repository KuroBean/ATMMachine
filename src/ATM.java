import java.util.*;

public class ATM {
	private Integer id;
	public HashMap<Integer,BankAccount> accounts=new HashMap<Integer,BankAccount>();
	public ATM() {
		
	}
	public void openAccount(Integer accNumber ) {
		accounts.put(accNumber,new BankAccount());
	}
	public void openAccount(Integer accNumber, double deposit ) {
		accounts.put(accNumber,new BankAccount(deposit));
	}
	
	
	private boolean accExists(Integer accNumber) {
		if(accounts.get(accNumber)==null) {
			return false;
		}else {
			return true;
		}
	}
	
	
	public void closeAccount(Integer accNumber) {
		if(accExists(accNumber)&&accounts.get(accNumber).getBalance()==0) {
			accounts.put(accNumber, null);
		}
	}
	public double checkBalance(Integer accNumber) {
		if(!accExists(accNumber)) {
			return 0.0;
		}
		else {
			return accounts.get(accNumber).getBalance();
		}
	}
	public boolean depositMoney(Integer accNumber, double depositMoney) {
		if((!accExists(accNumber))||depositMoney<0) {
			return false;
		}else {
			accounts.get(accNumber).deposit(depositMoney);
			return true;
		}
	}
	
	//rounding issues?
	public boolean withdrawMoney (Integer accNumber, double withdrawMoney) {
		if((!accExists(accNumber))||withdrawMoney<0||withdrawMoney>accounts.get(accNumber).getBalance()) {
			return false;
		}else {
			accounts.get(accNumber).withDraw(withdrawMoney);
			return true;
		}
	}
	
	
}
