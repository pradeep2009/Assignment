package arrayList.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Colors {
	
	public void remove(ArrayList<String> l)
	{
		//l.remove(2);
		//l.removeAll(l);
		//String l1=l.get(2);
		//l.add(0, "YELLOW");
		//l.add(5, "GREEN");
		//System.out.println(l);
	}

	public static void main(String[] args) {
		Colors cl=new Colors();
		ArrayList<String> l=new ArrayList<>();
		l.add("RED");
		l.add("BLUE");
		l.add("BLACK");
		l.add("ORANGE");
		//l.removeAll(l);
		l.clear();
		System.out.println(l);
		for(String o:l)
		{
			//System.out.print(o+" ");
		}
		for(int i=0;i<l.size();i++)
		{
			//System.out.print(l+" ");
		}
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String c=itr.next();
			//System.out.print(c+" ");
		}
		cl.remove(l);
	}

}
