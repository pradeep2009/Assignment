package wrapping.com;

public class Bank {
	
	String bank_name,ifsc_code;
	Bank(String n,String ifsc)
	{
		bank_name=n;
		ifsc_code=ifsc;
	}
	private void showBankDetails()
	{
		System.out.println("Bank name: "+bank_name+"\nIfsc code"+ifsc_code);
	}
	class Locker
	{
		int locker_id;
		String locker_location;
		Locker(int n,String l)
		{
			locker_id=n;
			locker_location=l;
		}
		public void lockerInfo()
		{
			showBankDetails();
			System.out.println("Locker id: "+locker_id+"\nLoker Location"+locker_location);
		}
	}

}
