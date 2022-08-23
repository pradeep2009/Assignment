package collection.com;

import java.util.Comparator;

public class SortById implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
	   if(o1.c_id>o2.c_id)
	   {
		   return 1;
	   }
	   else if(o1.c_id<o2.c_id)
	   {
		   return -1;
	   }
	   else
	   {
		   return 0;
	   }
		   
		
	}
	

}
