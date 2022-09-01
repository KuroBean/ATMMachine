
public class customAtmTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM jeff=new ATM();
		jeff.openAccount(666);
		jeff.depositMoney(666, 100);
		System.out.println(jeff.checkBalance(666));
		jeff.closeAccount(666);
		System.out.println(jeff.checkBalance(666));//should not close since 100 still in account
		jeff.withdrawMoney(666, 100);
		System.out.println(jeff.checkBalance(666));
		jeff.closeAccount(666);
		System.out.println(jeff.checkBalance(666));
	}

}
