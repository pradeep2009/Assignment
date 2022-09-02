package com.oops;

public class Account {
	
	int ac_no;
	float ac_bal;
	String ac_name;
	
	public void openAccount(int age)
	{
		if(age>=18)
		{
			System.out.println("Account will be Open:");
		}
		else
		{
			System.out.println("Not open the account: ");
		}
	}
	public void acceptAccountDetails(int acc_no,float acc_bal,String acc_name)
	{
		ac_no=acc_no;
		ac_bal=acc_bal;
		ac_name=acc_name;
		
	}
	public void showAccountDetails()
	{
		System.out.println("Account no: "+ac_no);
		System.out.println("Account balance: "+ac_bal);
		System.out.println("Account holder name: "+ac_name);
	}
	public void deposite(float amt)
	{
		ac_bal=ac_bal+amt;
		System.out.println("deposite "+amt+" then amount is: "+ac_bal);
	}
	public void withdraw(float withdraw_amt)
	{
		if(ac_bal>withdraw_amt)
		{
		ac_bal=ac_bal-withdraw_amt;
		System.out.println("Withdraw "+withdraw_amt+" then amount is: "+ac_bal);
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	public void showUpdatedBalance()
	{
		System.out.println("Updated balance is: "+ac_bal);
	}
	public static void main(String[] args) {
		
		Account a1=new Account();
		a1.openAccount(18);
		a1.acceptAccountDetails(2103,50000.00f,"Pradeep");
		a1.showAccountDetails();
		a1.deposite(12000.0f);
        a1.withdraw(10000.00f);
        a1.showUpdatedBalance();
	}

}
