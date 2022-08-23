package map.com;
import java.util.TreeMap;
public class CopyTreeMap
{
	 TreeMap<String,String> map1;
	 TreeMap<String,String> map2;
	
	CopyTreeMap()
	  {
		map1=new TreeMap<>();
		map2 = new TreeMap<>();
	  }
   
    public void cearteMap()
    {
    	 map1.put("c1", "Red");
    	 map1.put("C2", "Green");
    	 map1.put("C3", "Black");
    	 map1.put("C4", "White");
    	 map1.put("C5", "Blue");
		 System.out.println("\nTree Map 1: "+map1);
		 
		 map2.put("A1", "Orange");
		 map2.put("A2", "Pink");
		 System.out.println("\nTree Map 2: "+map2);
		    
    }
    
    public void addingTwoMap()
    {
    	 map1.putAll(map2);
		 System.out.println("\nAfter coping map2 to map1: ");
		 System.out.println(map1);
    }

	public static void main(String[] args) 
	{ 
		CopyTreeMap obj = new CopyTreeMap();
		obj.cearteMap();
		obj.addingTwoMap();	   
	}
}