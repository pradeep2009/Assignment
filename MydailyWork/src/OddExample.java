import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			Integer c=itr.next();
			if(c%2!=0)
			{
				System.out.print(c+" ");
			}
		}

	}

}
