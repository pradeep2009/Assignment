package arrayList.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class EvenNumber {
	
	public void even(ArrayList<Integer> l)
	{
		System.out.println("After even number is :");
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			Integer c=itr.next();
			if(c%2==0)
			{
				System.out.print(c+" ");
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=1;i<=50;i++)
		{
			l.add(i);
		}
        System.out.println(l);
       // Object[] a=l.toArray();
       // System.out.println(Arrays.toString(a));
        EvenNumber e=new EvenNumber();
        e.even(l);
	}

}
