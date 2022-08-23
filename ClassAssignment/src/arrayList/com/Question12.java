package arrayList.com;

import java.util.ArrayList;
import java.util.Collections;

public class Question12 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Pradeep");
		al.add("Ganesh");
		al.add("Ramesh");
		al.add("Aakash");
		al.add("Rohit");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("--------------------------------");
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(101);
		al1.add(342);
		al1.add(544);
		al1.add(654);
		al1.add(323);
		Collections.sort(al1);
		System.out.println(al1);
	}

}
