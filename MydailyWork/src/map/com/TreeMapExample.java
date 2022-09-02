package map.com;
 //Assignment : - Q.2) WAP to create a TreeMap which contains Strings
//               Q.3) WAP to search a key in a TreeMap.
//               Q.4) WAP to search a value in a TreeMap
import java.util.TreeMap;

public class TreeMapExample 
{
	TreeMap <String,String> t;
	
	TreeMapExample()
	{
		t = new TreeMap<>();
	}
	
	public void showTreeMap()
	{
		t.put("Suraj", "Pawar");
		t.put("Sohan", "Pawar");
		t.put("Siddesh", "Kamble");
		t.put("Rushi", "Jagtap");
		t.put("Akash", "Padale");
	}
	public void searchKey()
	{
		System.out.println(" TreeMap is :- ");
		System.out.println(t);
		if(t.containsKey("Rushi"))
		{
            System.out.println("\nThe Tree Map contains key Rushi");
        } else
        {
            System.out.println("The Tree Map does not contain key Rushi");
        }
        if(t.containsKey("Ram"))
        {
            System.out.println("\nThe Tree Map contains key Ram");
        } else 
        {
            System.out.println("The TreeMap does not contain key Ram");
        }
	}
	
	public void searchValue()
	{
		if(t.containsValue("Kamble"))
		{
            System.out.println("The Tree Map contains Value Kamble");
        } else
        {
            System.out.println("The Tree Map does not contain Value Kamble");
        }
        if(t.containsKey("Shinde"))
        {
            System.out.println("The Tree Map contains Value Shinde");
        } else 
        {
            System.out.println("The TreeMap does not contain Value Shinde");
        }
	}

	public static void main(String[] args)
	{
		TreeMapExample obj = new TreeMapExample();
		obj.showTreeMap();
		obj.searchKey();
		System.out.println();
		obj.searchValue();
	}
}