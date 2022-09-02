package map.com;
import java.util.Set;
import java.util.TreeMap;

public class ConatainInteger {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer,  String>();
		tm.put(12,"GANESH");
		tm.put(13,"RAHUL");
		tm.put(14,"SURESH");
		System.out.println(tm);
		if(tm.containsKey(16))  //search key in treemap
		{
			System.out.println("key is present");
		}
		else
		{
			System.out.println("key is not present");
		}
		if(tm.containsValue("GANESH"))  //search the value
		{
			System.out.println("value is present");
		}
		else
		{
			System.out.println("value is not present");
		}
		Set<Integer> s=tm.keySet();  //get all keys from treemap
		System.out.println(s);
		
		//tm.clear();         //delete all element from treemap
		//System.out.println(tm);
		TreeMap<Integer, String> tm1=new TreeMap<Integer, String>();
		tm1.putAll(tm);     //copy the map into another map
		System.out.println(tm1);
		
		
	}

}
