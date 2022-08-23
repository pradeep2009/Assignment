package map.com;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class SortByItemId implements Comparator<Item1>
{
	public int compare(Item1 i1,Item1 i2)
	{
		if(i1.i_cost>i2.i_cost)
			return -1;
		else if(i1.i_cost<i2.i_cost)
			return 1;
		else {
			if(i1.i_name.compareTo(i2.i_name)<0)
				return 1;
			else if(i1.i_name.compareTo(i2.i_name)>0)
				return -1;
			else
				return 0;
		}
	}
}


class Supplier
{
	int s_id;
	String s_name;
	Supplier(){}
	Supplier(int id,String s){
		s_id=id;
		s_name=s;
	}
	public String toString()
	   {
		   return s_id+" "+s_name;
	   }
	
}
class Item1  {
	
	int i_id,i_cost;
	String i_name;
	Item1(){}
	Item1(int id,String s,int c)
	{
		i_id=id;
		i_cost=c;
		i_name=s;
	}
   public String toString()
   {
	   return i_id+" "+i_cost+" "+i_name;
   }


}
public class Item
{

	public static void main(String[] args)
	{
		/*TreeMap<Item1, Supplier> tm=new TreeMap<Item1, Supplier>(new SortByItemId());
		tm.put(new Item1(1,"ganesh",24245),new Supplier(1,"ram"));
		tm.put(new Item1(1,"ganesh",1234),new Supplier(3,"SHAM"));
		tm.put(new Item1(3,"RAHUL",2434),new Supplier(2,"RAMU"));
		tm.put(new Item1(5,"abhi",2434),new Supplier(4,"deva"));
		//System.out.println(tm);
		for(Map.Entry<Item1, Supplier>  lh : tm.entrySet())
		{
			System.out.println(" Item = "+lh.getKey()+" Supplier = "+lh.getValue());
		}*/
//		TreeMap<Item1, Supplier> tm=new TreeMap<Item1, Supplier>(Collections.reverseOrder());
//		tm.put(new Item1(1,"ganesh",24245),new Supplier(1,"ram"));
//		tm.put(new Item1(2,"ganesh",1234),new Supplier(3,"SHAM"));
//		tm.put(new Item1(3,"RAHUL",2434),new Supplier(2,"RAMU"));
//		tm.put(new Item1(6,"RAMESH",8244),new Supplier(2,"RAMU"));
//		tm.put(new Item1(5,"abhi",2434),new Supplier(4,"deva"));
//		System.out.println(tm);
//		for(Map.Entry<Item1, Supplier>  lh : tm.entrySet())
//		{
//			System.out.println(" Item = "+lh.getKey()+" Supplier = "+lh.getValue());
//		}
		TreeMap<Item1, Supplier> tm=new TreeMap<Item1, Supplier>(Collections.reverseOrder(new SortByItemId()));
		tm.put(new Item1(1,"ganesh",24245),new Supplier(1,"ram"));
		tm.put(new Item1(2,"ganesh",1234),new Supplier(3,"SHAM"));
		tm.put(new Item1(3,"RAHUL",2434),new Supplier(2,"RAMU"));
		tm.put(new Item1(6,"RAMESH",8244),new Supplier(2,"RAMU"));
		tm.put(new Item1(5,"abhi",2434),new Supplier(4,"deva"));
		//tm.lowerKey(Item1);
		System.out.println(tm);
		for(Map.Entry<Item1, Supplier>  lh : tm.entrySet())
		{
			System.out.println(" Item = "+lh.getKey()+" Supplier = "+lh.getValue());
		}
		
		
	}
	
}
