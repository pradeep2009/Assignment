package com.oops;

public class Item {
	
	int item_id,item_cost;
	String item_name,suppl_name;
	public String toString()
	{
		String str="\nItem id: "+item_id+"\n Item cost: "+item_cost+"\n Item Name: "+item_name;
		return str;
	}
    Item(int it_id,int it_cost,String it_name)
	{
		
			item_id=it_id;
			item_name=it_name;
			item_cost=it_cost;
		
	}
   /* public void acceptItemDetails(int it_id,int it_cost,String it_name,String s_name)
	{
		item_id=it_id;
		item_cost=it_cost;
		item_name=it_name;
		suppl_name=s_name;
		
	}*/
   public void showDetails() {
	   
	   System.out.println("Item id: "+item_id);
	   System.out.println("Item cost: "+item_cost);
	   System.out.println("Item name: "+item_name);
	  // System.out.println("supplier name: "+suppl_name);
	   
   }
}
