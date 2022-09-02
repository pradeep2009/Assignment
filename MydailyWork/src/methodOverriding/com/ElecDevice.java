package methodOverriding.com;

public class ElecDevice {
	int qty;
	float itemprice;
	public float total;
	 
	
	protected void doSale(int qt,float pr)
	{
		qty=qt;
		 itemprice=pr;
		 System.out.println("Total bill is:"+qty*itemprice);
	}

}
class Tv extends ElecDevice
{
	
	public void doSale(int qty,float itemprice)
	{
		System.out.println("Tv quantity "+qty+" with price "+itemprice);
		super.doSale(qty, itemprice);
		float bill=(qty*itemprice)-1000;
		System.out.println("after discount: "+bill);
	}
}
class WashingMachine extends ElecDevice
{
	
	public void doSale(int qty,float itemprice)
	{
		System.out.println("Washing machine quantity "+qty+" with price "+itemprice);
		super.doSale(qty, itemprice);
		float bill=(qty*itemprice)-2000;
		System.out.println("after discount: "+bill);
	}
}
class Fridge extends ElecDevice
{
	 
	public void doSale(int qty,float itemprice)
	{
		System.out.println("Fridge Quantity "+qty+" with price "+itemprice);
		super.doSale(qty, itemprice);
		float bill=(qty*itemprice)-3000;
		System.out.println("after discount: "+bill);
	}
}