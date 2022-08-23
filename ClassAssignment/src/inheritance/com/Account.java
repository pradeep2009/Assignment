package inheritance.com;

public class Account {
    int ac_id;
    float balance;
    String cust_name;
    Account()
    {
    	ac_id=101;
    	balance=50000f;
    	cust_name="Pradeep shinde";
    }
	Account(String sn,float bal)
	{
		cust_name=sn;
		balance=bal;
	}
   public void openAccount()
   {
	   System.out.println("Account id: "+ac_id);
	   System.out.println("Account balance: "+balance);
	   System.out.println("open account");
   }
   public void showDetails()
   {
	   System.out.println("Account id: "+ac_id);
	   System.out.println("Account balance: "+balance);
	   System.out.println("Account holder name: "+cust_name);
	  
   }
}
class SavingAccount extends Account
{
	public void openAccount()
	   {
		 System.out.println("Account id: "+ac_id);
		   System.out.println("Account balance: "+balance);
		   System.out.println("open account in saving");
	   }
	float iRate;
	SavingAccount()
	{
		super();
		iRate=5.5f;
	}
	SavingAccount(float ir,int ac_id,float bal,String cust_name)
	{
		super(cust_name,bal);
		iRate=ir;
		this.ac_id=ac_id;
		
	}
	public void showSavingAccDetails()
	{
		showDetails();
		System.out.println("show interest rate(%):"+iRate);
	}
	public void deposite(float amt)
	{
		balance+=amt;
		System.out.println("Total balance:"+balance);
	}
	public void withdraw(float amt)
	{
		balance-=amt;
		System.out.println("After Withdraw:"+balance);
	}
}
