package map.com;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesExample {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder()
				);
		ts.add(34);
		ts.add(65);
		ts.add(12);
		ts.add(98);
		ts.add(56);
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext())
		{
			Integer o=itr.next();
			System.out.println(o);
		}

	}

}
