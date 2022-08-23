package collection.com;

import java.util.ArrayList;
import java.util.Collections;

public class Example {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		//System.out.println(l);
		//System.out.println(l.size());
		l.add("hi");
		l.add("hello");
		l.add("good");
		l.add("morning");
		//l.set(1, "night");
		System.out.println(l);
		//System.out.println(l.size());
		Collections.sort(l);
        System.out.println(l);
	}

}
