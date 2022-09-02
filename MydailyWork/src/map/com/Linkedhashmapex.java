package map.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmapex {

	public static void main(String[] args) {
	 LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
	  
	  hm.put(100,"Pradeep");  
	  hm.put(101,"ganesh");  
	  hm.put(102,"Rahu");  
	  
	for(Map.Entry m:hm.entrySet())
	{  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  

}
