package map.com;



import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
//Assignment :-  Q.1) WAP to create a TreeMap which contains Integers

public class CreateTreeMap
{
	TreeMap<Integer,Integer> tm;
	
	CreateTreeMap()
	{
	  tm = new TreeMap<>();
	}

	public void showTreeMap()
	{
		tm.put(1, 101);
		tm.put(2, 102);
		tm.put(3, 103);
		tm.put(4, 104);
		tm.put(5, 105);
		tm.put(6, 106);
		tm.put(7, 107);
		tm.put(8, 108);
		
		System.out.println(" Tree Map is :- ");
		System.out.println(tm);
		
		System.out.println("\nUsing Iterator :- ");
		System.out.println(" Tree Map is :- ");
		Set<Integer> s = tm.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		 {
		    Integer key = itr.next();
		    System.out.println(key+" = "+tm.get(key));
		  }
			
	}
	public static void main(String[] args) 
	{
		CreateTreeMap obj = new CreateTreeMap();
		obj.showTreeMap();

	}
}
