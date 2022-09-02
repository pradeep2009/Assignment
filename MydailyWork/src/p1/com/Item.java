package p1.com;

public class Item {
	private int itemid;
	private float itemcost;
	private String itemname;
	
	public int getItemId()
	{
		return itemid;
	}
	public void setItemId(int x)
	{
		this.itemid=x;
	}
	public float getItemCost()
	{
		return itemcost;
	}
	public void setItemCost(float x)
	{
		itemcost=x;
	}
	public String getItemName()
	{
		return itemname;
	}
	public void setItemName(String y)
	{
		  itemname=y;
	}
  /* public void showDetails() {
	   
	   System.out.println("Item id: "+itemid);
	   System.out.println("Item cost: "+itemcost);
	   System.out.println("Item name: "+itemname);
	  
	   
   }*/
}
