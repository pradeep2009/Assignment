package map.com;

import java.util.HashSet;
import java.util.Iterator;

class Laptop
{
	String os_name,brand_name;
	int price;
	Laptop(String o,String b,int p)
	{
		os_name=o;
		brand_name=b;
		price=p;
	}
	public String toString()
	{
		return "\n"+os_name+"\n"+brand_name+"\n"+price;
	}
	
	public int hashCode()
	{
		return os_name.hashCode()+brand_name.hashCode()+price;
	}
	public boolean equals(Object obj) 
	{
        if(this == obj)
        {
        	return true;
        }
	   if(obj==null || this.getClass() != obj.getClass()) 
	   {
		return false;
	   }
	   Laptop s=(Laptop)obj;
	   return this.os_name.equals(s.os_name) && this.brand_name.equals(s.brand_name) && this.price==s.price;
    }
	
}


public class LaptopEx {

	public static void main(String[] args) {
		HashSet<Laptop> hs=new HashSet<Laptop>();
         hs.add(new Laptop("linux","Dell",42424));
         hs.add(new Laptop("windows","Hp",64644));
         hs.add(new Laptop("windows","Hp",64644));
         hs.add(new Laptop("windows","Hp",64644));
         hs.add(new Laptop("MAC","Acer",24253));
         
         Iterator<Laptop> sa=hs.iterator();
 		while(sa.hasNext())
 		{
 			Laptop o=sa.next();
 			System.out.println(o);
 		}
         
	}

}
