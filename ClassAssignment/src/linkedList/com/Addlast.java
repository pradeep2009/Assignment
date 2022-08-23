package linkedList.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Addlast {
	
	public void addElemtSpeci(LinkedList<Integer> l)
	{
		l.set(2, 77);
		System.out.println(l);
	}
	public void firstLast(LinkedList<Integer> l)
	{
		l.addFirst(98);
		l.addLast(88);
		System.out.println(l);
	}
	public void swap(LinkedList<Integer> l)
	{
		Collections.swap(l, 3, 0);
		System.out.println(l);
	}
	public void join(LinkedList<Integer> l,LinkedList<Integer> l1)
	{
		//l.addAll(l1);
		//System.out.println(l);
	}
	public void carray(LinkedList<Integer> l)
	{
		Object s[]=l.toArray();
		System.out.println(Arrays.toString(s));
	}
	public void cloneMethod(LinkedList<Integer> l)
	{
		Object a=l.clone();
		System.out.println(a);
	}

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(25);
		l.add(43);
		l.add(21);
		l.add(54);
		l.add(66);
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(21);
		l1.add(11);
		l1.add(28);
		l1.add(98);
		l1.add(66);
		//System.out.println(l);
		l.addLast(54);
		//System.out.println(l);
		/*Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			Integer s=itr.next();
			System.out.print(s+" ");
		}
		System.out.println();
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		for(int i=l.size()-1;i>0;i--)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();*/
		Addlast a=new Addlast();
//		a.addElemtSpeci(l);
//		a.firstLast(l);
//		a.swap(l);
//		a.join(l, l1);
//		a.carray(l);
		a.cloneMethod(l);
	}

}
