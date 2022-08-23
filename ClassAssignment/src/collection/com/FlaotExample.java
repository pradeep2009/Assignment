package collection.com;

import java.util.ArrayList;
import java.util.Collections;

public class FlaotExample {

	public static void main(String[] args) {
		
      ArrayList<Float> l=new ArrayList<Float>();
      l.add(23.3f);
      l.add(56.3f);
      l.add(22.7f);
      l.add(43.3f);
      l.add(21.3f);
      Collections.sort(l);
      System.out.println(l);
	}

}
