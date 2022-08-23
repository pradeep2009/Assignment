package linkedHashMap.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEx {
	LinkedHashMap lh,lh1;
	LinkedHashMap<Integer, String> lh2;
	LinkedHashMap<String,Integer> lh3;
	LinkedHashMapEx()
	{
		lh=new LinkedHashMap();
		lh1=new LinkedHashMap();
		lh2=new LinkedHashMap<Integer, String>();
		lh3=new LinkedHashMap<String,Integer>();
	}
	public void createMap()
	{
		lh.put(12, "pradeep");
		lh.put(13, "ram");
		lh.put(11, "ganu");
		lh.put(10, "mahesh");
		Set<Entry> s1=lh.entrySet();
		Iterator<Entry> itr=s1.iterator();
		while(itr.hasNext())
		{
			Entry o=itr.next();
			System.out.println("Key: "+o.getKey()+" Value: "+o.getValue());
		}
		System.out.println("_____________________________________");
		lh1.put( "pradeep",12);
		lh1.put("ram",13);
		lh1.put("ganu",11);
		lh1.put("mahesh",10);
		Set<Entry> s2=lh1.entrySet();
		Iterator<Entry> itr1=s2.iterator();
		while(itr1.hasNext())
		{
			Entry o=itr1.next();
			System.out.println("Key: "+o.getKey()+" Value: "+o.getValue());
		}
		
	}
	public void createMap1()
	{
		lh2.put(12, "pradeep");
		lh2.put(13, "ram");
		lh2.put(11, "ganu");
		lh2.put(10, "mahesh");
		Set<Entry<Integer,String>> s1=lh2.entrySet();
		Iterator<Entry<Integer,String>> itr=s1.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> o=itr.next();
			System.out.println("Key: "+o.getKey()+" Value: "+o.getValue());
		}
		System.out.println("_____________________________________");
		lh3.put( "pradeep",12);
		lh3.put("ram",13);
		lh3.put("ganu",11);
		lh3.put("mahesh",10);
		Set<Entry<String,Integer>> s2=lh3.entrySet();
		Iterator<Entry<String,Integer>> itr1=s2.iterator();
		while(itr1.hasNext())
		{
			Entry<String,Integer> o=itr1.next();
			System.out.println("Key: "+o.getKey()+" Value: "+o.getValue());
		}
				
	}
	public void searchMap()
	{
		lh2.put(12, "pradeep");
		lh2.put(13, "ram");
		lh2.put(11, "ganu");
		lh2.put(10, "mahesh");
		if(lh2.containsValue("ganu"))  //find value
		{
			System.out.println("is found");
		}
		else
		{
			System.out.println("not found");
		}
		Set<Integer> s1=lh2.keySet();   //find all keys
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext())
		{
			Integer o=itr.next();
			System.out.println("Key: "+o);
		}
		if(lh.remove(12, "pradeep"))
		{
			System.out.println("element remove");
		}
		else
		{
			System.out.println("element not remove");
		}
	}
	public void copyHashMap()
	{
		HashMap<Integer, String> hp=new HashMap<Integer, String>();
		hp.put(23,"pradeep");
		hp.put(24,"ganesh");
		hp.put(25,"mahesh");
		hp.put(21,"ram");
		lh2.putAll(hp);
		Set<Entry<Integer,String>> s1=lh2.entrySet();
		Iterator<Entry<Integer,String>> itr=s1.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> o=itr.next();
			System.out.println("Key: "+o.getKey()+" Value: "+o.getValue());
		}
		lh2.clear();
		System.out.println(lh2);
		
	}


	public static void main(String[] args) {
		LinkedHashMapEx lh=new LinkedHashMapEx();
		lh.createMap();
		System.out.println("---------------------------------------------");
		lh.createMap1();
		lh.searchMap();
		System.out.println("---------------------------------------------");
		lh.copyHashMap();

	}

}
