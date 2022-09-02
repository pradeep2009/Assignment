package wrapping.com;

public enum Softy{
	VANILLA(80,2),MANGO(90,3),BUTTERSCOTH(110,4);
	int price,qty,bill;
	Softy(int price,int qty)
	{
		this.price = price;
		this.qty = qty;
	}
	public int getPrice()
	{
		return price;
	}
	public int getQty()
	{
		return qty;
	}
	public void setBill()
	{
		System.out.println("Total bill is "+(price*qty));
	}
}
