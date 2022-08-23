package collection.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SearchElement {
	
	public void search(ArrayList<String> l,String str)
	{
		
		for(Iterator<String> itr=l.iterator();itr.hasNext();)
		{
			String o=itr.next();
			if(o.equals(str))
			{
				System.out.println("Available in list");
			}
			else
			{
				System.out.println("Not Available in list.");
			}
			
		}
		
		
	}
	public void addFirst(ArrayList<String> l,String str)
	{
		
		for(int i=0;i<l.size();i++)
		{
			
				l.add(0, str);
			
		}
		System.out.println(l);
		
	}

	public static void main(String[] args) {
		SearchElement  se=new SearchElement();
		
		ArrayList<String> l=new ArrayList<>();
		l.add("hi");
		l.add("hello");
		l.add("good");
		l.add("morning");
		l.add("beautiful");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		System.out.println(l);
		//se.search(l,str);
		se.addFirst(l,str);

	}

}
