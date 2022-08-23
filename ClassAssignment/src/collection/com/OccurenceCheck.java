package collection.com;

import java.util.ArrayList;
class OccurenceCheck {
	
	public void checkOccurence(ArrayList<Integer> s)
	{	
		System.out.println("Occurence Check Of Object");
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i)==-1)
				continue;
			int cnt=1;
			for(int j=i+1;j<s.size();j++)
			{
				if(s.get(i).equals(s.get(j)))
				{
				    cnt++;
				    s.set(j, -1);
				}
			}
		System.out.println(s.get(i)+" occurs at "+cnt+" times");	
		}
	}
		
			
			
		/*while(itr1.hasNext())
		{
			Integer o1 = itr1.next();
			cnt=Collections.frequency(s, o1);
			System.out.println(o1+" occures at "+cnt+" times");

		}*/
		/*for(Integer x:s)
		{
			cnt=Collections.frequency(s, x);
			System.out.println(s+"occures at "+cnt+" times");
		}
		
	}*/

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
	    s.add(15);
	    s.add(35);
	    s.add(15);
	    s.add(25);
	    s.add(15);
	    s.add(35); 
	    s.add(15);
	    s.add(21);
	    s.add(25);
	    //Object[] a=s.toArray();
	    System.out.println("ArrayList: " + s);    
	    OccurenceCheck oc=new OccurenceCheck();
        oc.checkOccurence(s);
	}

}
