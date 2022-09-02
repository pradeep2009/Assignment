package arrayobject.com;

import java.util.Arrays;

public class Inventory 
{
	
	public void accept(Item[] i)
	{
		i[0]=new Item(101,199,"pen");
		i[1]=new Item(102,300,"compass");
		i[2]=new Item(103,400,"chart");
		i[3]=new Item(104,200,"backboard");
		i[4]=new Item(104,200,"pen");
	}
	public void show(Item[] i)
	{
		System.out.println("Item cost is greater than 200 details: ");
		//System.out.println(Arrays.toString(i));
		for(Item a:i)
		{
			if(a.item_cost>200)
			{
			System.out.println(a);
			}
		}
		
	}
	public void minCost(Item[] i)
	{  
		//System.out.println(Arrays.toString(i));
		System.out.println("Item with minimum cost details: ");
		int min=i[0].item_cost;
		for(Item a:i)
		{
			if(min>a.item_cost)
			{
				min=a.item_cost;
			}
		}
		for(Item a:i)
		{
			if(a.item_cost==min)
			{
			System.out.println(a);
			}
		}
		//System.out.println(min);
		
	}
	public void maxCost(Item[] i)
	{  
		System.out.println("Item with maximum cost details: ");
		//System.out.println(Arrays.toString(i));
		int max=i[0].item_cost;
//		for(Item a:i)
//		{
//			if(max<a.item_cost)
//			{
//				max=a.item_cost;
//			}
//		}
//		for(Item a:i)
//		{
//			if(a.item_cost==max)
//			{
//			System.out.println(a);
//			}
//		}
		int maxcostItemIndex=0;
		
		for(int j=0;j<i.length;j++)
		{
			if(i[j].item_cost>max)
			{
				max=i[j].item_cost;
				maxcostItemIndex=j;
			}
		}
		System.out.println("Max cost of item is :"+ max);
		System.out.println("Details of item with max cost are like this...");
		System.out.println(i[maxcostItemIndex]);
		//System.out.println(max);
	}
	public void avgCost(Item[] i)
	{  
		System.out.println("Item with avg cost details: ");
		
		int length=i.length;
		int total=0;
		float avg;
		for(Item a:i)
		{
			total=total+a.item_cost;
		}
		avg=total/length;
		System.out.println("average of item cost:"+avg);
	}
	public void penCost(Item[] i)
	{  
		for(int j=0;j<i.length;j++)
		{
			for(int k=j+1;k<i.length;k++)
			{
				if(i[j].item_cost==i[k].item_cost)
				{
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		/*Inventory s=new Inventory();
		Item i[]=new Item[5];
		s.accept(i);
		s.show(i);
		System.out.println("____________________________________");
		s.minCost(i);
		System.out.println("____________________________________");
		s.maxCost(i);
		System.out.println("____________________________________");
		s.avgCost(i);
		System.out.println("____________________________________");
		s.penCost(i);*/
		
		Item j=new Item(101,500,"apple");
		Item k=new Item(101,500,"apple");

		if(j==k)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal ");
		}
		if(j.equals(k))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal ");
		}
	}

}

