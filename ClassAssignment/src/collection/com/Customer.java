package collection.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;

public class Customer implements Comparable<Customer>{
	int c_id;
	String c_name;
	int c_age;
	Customer(int id,String s,int f)
	{
		c_id=id;
		c_name=s;
		c_age=f;
		
	}
	public String toString()
	{
		return "\nCustomer id:"+c_id+"\nCustomer Name:"+c_name+"\nCustomer Age: "+c_age;
	}
	
	public void showMin(ArrayList<Customer> l)
	{
		Iterator<Customer> itr=l.iterator();
		
		int min= Integer.MAX_VALUE;
		for(;itr.hasNext();)
		{
			
			 Customer o=itr.next();
			if(min>o.c_age)
			{
				min=o.c_age;	
			}
		
		}
		show(l, min);
	}
	public void show(ArrayList<Customer> l,int min)
	{
		System.out.println("Min age Customer are : ");
		Iterator<Customer> itr1 = l.iterator();
		while(itr1.hasNext())
		{
			Customer o1 = itr1.next();
			if(min == o1.c_age)
			{
				System.out.println(o1);
			}

		}
	}
	public void showMax(ArrayList<Customer> l)
	{
		Iterator<Customer> itr=l.iterator();
		
		int max= Integer.MIN_VALUE;
		for(;itr.hasNext();)
		{
			
			 Customer o=itr.next();
			if(max<o.c_age)
			{
				max=o.c_age;	
			}
		
		}
		show(l, max);
	}
	public void showmax(ArrayList<Customer> l,int max)
	{
		System.out.println("Min age Customer are : ");
		Iterator<Customer> itr1 = l.iterator();
		while(itr1.hasNext())
		{
			Customer o1 = itr1.next();
			if(max == o1.c_age)
			{
				System.out.println(o1);
			}

		}
		Collections.sort(l);
	}
	
		   
	public void checkOccurence(ArrayList<Customer> l)
	{	
		System.out.println("Occurence Check Of Object");
		System.out.println("Occurence Check Of Object");
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==null)
				continue;
			int cnt=1;
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
				    cnt++;
				    l.set(j,null);
				}
			}
		System.out.println(l.get(i)+" occurs at "+cnt+" times");	
		}
	}
	@Override
	public boolean equals(Object obj) 
	{
        if(this == obj)
        {
        	return true;
        }
	   if(obj==null || this.getClass() != obj.getClass()) 
	   {
		return false;
	   }
	   Customer c=(Customer)obj;
	   return this.c_id==(c.c_id) && this.c_name.equals(c.c_name) && this.c_age==(c.c_age);
    }	
	
   /*public void change(ArrayList<Customer> l)
   {
	   Iterator<Customer> itr = l.iterator();
	   
	   String s="Abhi2";
		for(int i=0;itr.hasNext();i++)
		{
			Customer c=itr.next();
			if(s.equals(c.c_name))
			{
				System.out.println("Name is : "+l.get(i));
				System.out.println("---------------------");
				c.c_age=45;
				System.out.println(l.get(i));
			}
		}
   }
  /* @Override
   public int compareTo(Customer o) {
		if(this.c_age>o.c_age)
		  return -1;
		else if(this.c_age<o.c_age)
			return 1;
		else
		{
		
		  return 0;
		}
   }*/
			
  /* public int compareTo(Customer o) {
		if(this.c_age<o.c_age)
		  return 1;
		else if(this.c_age>o.c_age)
			return -1;
		else
		{
		  
		   if(this.c_name.compareTo(c_name)>0)
			   return 1;
		   else if(this.c_name.compareTo(c_name)<0)
			   return -1;
		   else
		   {
			   if(this.c_id>o.c_age)
				   return 1;
			   else if(this.c_id<o.c_age)
				   return -1;
			   else
				   return 0;
		   }
			   
			   
		}
  }	*/
	
	@Override
	public int compareTo(Customer o) {
		
		return 0;
	}
	
   
	public static void main(String[] args) {
		ArrayList<Customer> l;
		l=new ArrayList<Customer>();
		Customer b=new Customer(1, "Ganu", 52);
		l.add(b);
		l.add(new Customer(2, "Abhi", 56));
		l.add(new Customer(5, "Gana",33));	
		l.add(new Customer(2, "Abhi", 56));
		l.add(new Customer(3, "Abhi",56));
		l.add(new Customer(6, "Abhi2", 36));
		//Collections.sort(l, new SortById());
		//Collections.sort(l, new SortByName());
		
		//System.out.println(l);
		//Collections.sort(l);
		//System.out.println(l);
		//b.showMin(l);
		//b.showMax(l);
		//Object a[]=l.toArray();
		b.checkOccurence(l);
	  
		//b.change(l);
		/*Consumer<Customer> c1=(list)->{for(String s:list)
		                              {System.out.println(s+"="s.legth())}
		                              }
		};*/	
		
		
		
       // l.forEach((str)->System.out.println(str));
	}
	
	

}
