package map.com;

import java.util.NavigableMap;
import java.util.TreeMap;

 
public class Practice {

    
    public static void main(String[] args) {  
        TreeMap<Integer, String> map=new TreeMap<Integer, String>();  
        
        map.put(1,"Amit");  
        map.put(5,"Rahul");  
        map.put(2,"Jai");  
        map.put(6,"Amit"); 
        System.out.println(map);
        //int ans=map.lowerKey(1);
      NavigableMap<Integer, String> nm =map.descendingMap();
        System.out.println(nm);
       // System.out.println(ans);
       
        
        
       /* Set set=map.entrySet();  
        Iterator itr=set.iterator();  
        while(itr.hasNext()){  
            
            Map.Entry entry=(Map.Entry)itr.next();  
            System.out.println(entry.getKey()+" "+entry.getValue());  
        } */
    }

	
	
 } 

