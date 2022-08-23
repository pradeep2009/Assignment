package p1.com;

public class Account {
	
	final static int ifsccode=2563;
	static float iRate=5.5f;
	int ac_no;
	String ac_name;
	Account()
	{
		ac_no=2103;
		ac_name="pradeep";
	}
	Account(int n,String name)
	{
		ac_no=n;
		ac_name=name;
	}
	
	public void chageIntrest()
	{
	   
	   System.out.println(iRate);
	}
	public static void main(String a[])
	{
		Account a1=new Account();
		Account a2=new Account(4503,"rahul");
		Account a3=new Account(8895,"ganesh");
		Account.iRate=5.7f;
		a1.chageIntrest();
		Account.iRate=4.5f;
		a2.chageIntrest();
		Account.iRate=6.3f;
		a3.chageIntrest();
		//a1.ifsccode=6663;
		
		
	}

}
