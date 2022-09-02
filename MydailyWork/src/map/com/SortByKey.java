package map.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
class SortByKey1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}

	
	
}

public class SortByKey {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer,String>(new SortByKey1());
		tm.put(12,"GANESH");
		tm.put(17,"RAHUL");
		tm.put(11,"RAM");
		tm.put(14,"SURESH");
		tm.put(13,"MAHESH");
		System.out.println(tm);
		Integer ans=tm.firstKey();
		Integer ans1=tm.lastKey();
		
		System.out.println("Greatest key:"+ans);
		System.out.println("Least key:"+ans1);

	}

}
