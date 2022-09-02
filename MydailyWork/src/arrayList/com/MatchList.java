package arrayList.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatchList {

	public void checkEqual(ArrayList<String> l,ArrayList<String> l1)
	{
		Collections.sort(l);
		Collections.sort(l1);
		boolean result=l.equals(l1);
		System.out.println(result);
	}
	public void swap(ArrayList<String> l)
	{
		Collections.swap(l, 1, 0);
		System.out.println(l);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<>(Arrays.asList("a","b","c"));
		ArrayList<String> l1=new ArrayList<>(Arrays.asList("b","a","c"));
		MatchList m=new MatchList();
		//m.checkEqual(l,l1);
		//m.swap(l);
	}

}
