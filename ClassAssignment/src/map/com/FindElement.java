package map.com;

//Assignment :- Q.6) WAP to create a LinkedHashMap. Add 3 objects in it.
//a. WAP to search a value in the Map.
//b. WAP to get all keys in the Map.
//c. WAP to remove an element from the Map
import java.util.LinkedHashMap;
import java.util.Map;

public class FindElement 
{
	LinkedHashMap<Integer, String> l;

	FindElement()
	{
		l = new LinkedHashMap<Integer, String>();
	}

	public void createMap()
	{
		l.put(1, "Mars");
		l.put(2, "Earth");
		l.put(3, "Jupiter");
		l.put(4, "Saturn");
		l.put(5, "Venus");
	}
	public void searchValue()
	{
		System.out.println("LinkedHashMap is : ");
		System.out.println(l);
		if(l.containsValue("Earth"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

	public void getAllKeys()
	{
		System.out.println("LinkedHashMap is : ");
		System.out.println(l);
		for(Map.Entry<Integer, String>  lh : l.entrySet())
		{
			System.out.println(" Key = "+lh.getKey()+" Value = "+lh.getValue());
		}
	}
	public void removeElement()
	{
		System.out.println("\nLinkedHashMap is : ");
		System.out.println(l);
		l.remove(4);
		System.out.println("\nUpdated LinkedHashMap : "+l);
   }

	public static void main(String[] args) 
	{
		FindElement obj = new FindElement();
		obj.createMap();
		obj.searchValue();
		System.out.println();
		obj.getAllKeys();
		System.out.println();
		obj.removeElement();

	}

}