package inheritance.com;

public class Bank {

	public static void main(String[] args) {
		
		SavingAccount s=new SavingAccount();
		SavingAccount s1=new SavingAccount(5.5f,103,40000f,"Nikhil");
		s.showSavingAccDetails();
		s.deposite(1550f);
		s.withdraw(2000f);
		System.out.println("-----------------------------");
		s1.showSavingAccDetails();
		s1.deposite(3000f);
		s1.withdraw(1500f);
		System.out.println("-------------------------------");
		Account a=new SavingAccount();
		a.openAccount();
	}

}
