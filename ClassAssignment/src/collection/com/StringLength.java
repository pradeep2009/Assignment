package collection.com;

import java.util.ArrayList;
import java.util.Iterator;

public class StringLength {
	
	public void lengthCheck(ArrayList<String> l)
	{
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String o=itr.next();
			if(o.length()>5)
			{
				itr.remove();
			}
		}
		System.out.println(l);
	}

	public static void main(String[] args) {
		
		StringLength sl=new StringLength();
		ArrayList<String> l=new ArrayList<>();
		l.add("hi");
		l.add("hello");
		l.add("good");
		l.add("morning");
		l.add("beautiful");
		System.out.println(l);
		sl.lengthCheck(l);
	}

}
