package collection.com;

import java.util.ArrayList;
import java.util.Collection;

public class Practice {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		ArrayList<Integer> l1=new ArrayList<>();
		l.add(23);
		l.add(43);
		l.add(34);
		l.add(23);
		l.add(76);
		l1.add(65);
		l1.add(43);
		l1.add(64);
		l1.add(88);
		l1.add(76);
		System.out.println(l);
		System.out.println(l.iterator());
		System.out.println(l1);
		System.out.println(l.addAll(l1));//add two list..
		System.out.println(l);
		System.out.println(l.retainAll(l1));//common element print in left hand side of list.
		System.out.println(l);
		System.out.println(l.contains(96));//check object is present i given string.

	}

}
