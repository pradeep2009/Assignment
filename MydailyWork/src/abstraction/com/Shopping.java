package abstraction.com;

abstract class PaymentMod
{
	abstract void pay();
}
class CreditCard extends PaymentMod
{
	public void pay()
	{
		System.out.println("payement through creditcard");
	}
}
class DebitCard extends PaymentMod
{
	public void pay()
	{
		System.out.println("payement through debitcard");
	}
}
class NetBanking extends PaymentMod
{
	public void pay()
	{
		System.out.println("payement through netbanking");
	}
}
public class Shopping {

	public static void main(String[] args) {
		PaymentMod p=new CreditCard();
		p.pay();
		PaymentMod p1=new DebitCard();
		p1.pay();
		PaymentMod p2=new NetBanking();
		p2.pay();
			
			

	}

}
