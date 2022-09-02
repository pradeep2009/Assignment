package map.com;

import java.util.HashSet;
import java.util.Iterator;

public class PracticeString12 {

	public static void main(String[] args) {
		
		String str="It is very Cloudy It is raining Heavily";
		String s[]=str.split(" ");
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			hs.add(s[i]);
		}
		
		 Iterator<String> sa=hs.iterator();
	 		while(sa.hasNext())
	 		{
	 			String o=sa.next();
	 			System.out.println(o);
	 		}

	}

}
