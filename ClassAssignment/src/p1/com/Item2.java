package p1.com;

public class Item2 {
	
	public int itemid,qty;
	public float itemcost;
	public String itemname;
	public static float gst=18.5f;
	public double total_bill,bill;
	public static int cnt=0;
	
	
	
	Item2()
	{
		itemid=++cnt;
		itemcost=8909.07f;
		itemname="XYZ";
	}
	Item2(float cost)
	{
		itemid=++cnt;
		itemcost=cost;
		//System.out.println(itemid);
		//System.out.println(itemcost);
		
	}

	Item2(float cost,String name)
	{
		
		
		itemid=++cnt;
		itemcost=cost;
		itemname=name;
	}
	/*public void calculateBill(int id,float cost,String name,int qty)
	{
		this.itemid=id;
		this.itemname=name;
		this.qty=qty;
		this.itemcost=cost;
		Item2.changeGst(gst);
		bill=qty*itemcost;
		total_bill=(bill*gst); 
	}
	public static void changeGst(float gst)
	{
		Item2.gst=gst;
		
	}*/
	public void display()
	{
		System.out.println("Item Id: "+itemid);
		System.out.println("Item Cost: "+itemcost);
		System.out.println("Item Name: "+itemname);
		System.out.println("no of object: "+Item2.cnt);
		//System.out.println("Bill:"+bill);
		//System.out.println("with gst total Bill:"+total_bill);
		
	}
	
	public static void main(String[] args) {
		
		Item2 i1,i2,i3;
		
		i1=new Item2();
		
		i1.display();
		
		System.out.println("-------------------------");
		
		i2=new Item2(25.15f);
		//i2.calculateBill(20.4f, "pradeep",12);
		i2.display();
		
		//i2.display();
		//Item2.changeGst(20.7f);
		
		System.out.println("-------------------------");
		
		i3=new Item2(2851.02f,"PQR");
		i3.display();
		
		
		
	}
}
