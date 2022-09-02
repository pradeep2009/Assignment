package arrayobject.com;

public class Item {
	
	int item_id,item_cost;
	String item_name,suppl_name;
	public String toString()
	{
		String str="\nItem id: "+item_id+"\nItem cost: "+item_cost+"\nItem Name: "+item_name;
		return str;
	}
    Item(int it_id,int it_cost,String it_name)
	{
		
			item_id=it_id;
			item_name=it_name;
			item_cost=it_cost;
		
	}
   /* public boolean equals(Object obj)
    {
    	if(this==null)return false;
    	Item b=(Item)obj;
    	if(this.item_id==b.item_id && this.item_cost==b.item_cost && this.item_name==b.item_name)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }*/
  
   public void showDetails() {
	   
	   System.out.println("Item id: "+item_id);
	   System.out.println("Item cost: "+item_cost);
	   System.out.println("Item name: "+item_name);
	  // System.out.println("supplier name: "+suppl_name);
	   
   }

}
