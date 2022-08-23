package com.oops;

import java.util.Arrays;

public class Inventory 
{
	
	public void accept(Item[] i)
	{
		i[0]=new Item(101,199,"pradeep");
		i[1]=new Item(102,300,"Rahul");
		i[2]=new Item(103,400,"Ganesh");
		
	}
	public void show(Item[] i)
	{
		//System.out.println(Arrays.toString(i));
		for(Item a:i)
		{
			if(a.item_cost>200)
			{
			System.out.println(a);
			}
		}
		
	}

	public static void main(String[] args) {
		
		Inventory s=new Inventory();
		Item i[]=new Item[3];
		s.accept(i);
		s.show(i);
		/*Item i1,i2,i3;
		
	    i1=new Item();
		i1.acceptItemDetails(101,25,"pen","Ramesh");
		i1.showDetails();
		
		System.out.println("--------------------------");
		
		i2=new Item();
		i2.acceptItemDetails(110,50,"ice-cream","sagar");
		i2.showDetails();
		System.out.println("--------------------------");
		
		i3=new Item();
		i3.acceptItemDetails(140,250,"clothes","geeta");
		i3.showDetails();*/

	}

}
