package collection.com;

import java.util.Comparator;

public class SortByName implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
	   return o1.c_name.compareTo(o2.c_name);
	}
}
