package polymorphism.com;
public class Overloadingex 
{

public void doOnlineTrans(Creditcard c)
{
	c.doPayment(4520);
}
public void doOnlineTrans(Debitcard c)
{
	c.doPayment(5656);
}
public void doOnlineTrans(NetBanking n)
{
	n.doPayment(7480);
}



	public static void main(String[] args) {
		
		Overloadingex o1=new Overloadingex();
		Creditcard c1=new Creditcard();
		NetBanking n=new NetBanking();
		
		o1.doOnlineTrans(c1);
		o1.doOnlineTrans(new Debitcard());
		o1.doOnlineTrans(n);

	}
}
