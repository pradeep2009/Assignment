package map.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<Integer, String> al=new HashMap<Integer, String>();
        al.put(23, "sdsdsd");
		 al.put(246, "lkldsd");
		 al.put(56, "sjghf");
		 al.put(56, "sdutyud");
		 al.put(354, "sdasdsd");
		 al.put(2456, "sdsdsd");
		 al.put(657, "sdsdsd");
		 al.put(2376, "dsd");
		 al.put(54, "snbsd");
		 al.put(543, "sdsdsd");
		 al.put(13, "fsc");*/
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(13);
		hs.add(15);
		hs.add(18);
		hs.add(13);
		hs.add(12);
		hs.add(11);
		hs.add(13);
		hs.add(90);
		hs.
		for(Integer s:hs)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		Iterator<Integer> sa=hs.iterator();
		while(sa.hasNext())
		{
			Integer  p=sa.next();
			System.out.println(p);
		}
		 
		 
		 
	}

}
