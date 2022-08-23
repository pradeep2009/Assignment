package polymorphism.com;

class Creditcard {
	
	public void doPayment(int amt)
	{
		System.out.println("credit card use with rs: "+amt);
	}

}
class Debitcard {
	
	public void doPayment(int amt)
	{
		System.out.println("debit card use with rs: "+amt);
	}

}
class NetBanking {
	
	public void doPayment(int amt)
	{
		System.out.println("net banking use with rs: "+amt);
	}

}
