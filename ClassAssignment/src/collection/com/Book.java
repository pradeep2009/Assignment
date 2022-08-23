package collection.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Book implements Comparable<Book>{
	
	int b_id;
	String b_name;
	float b_price;
	Book(int id,String s,float f)
	{
		b_id=id;
		b_name=s;
		b_price=f;
		
	}
	public String toString()
	{
		return "\nBook id:"+b_id+"\nBook Name:"+b_name+"\nBook Price: "+b_price;
	}
	@Override
	public int compareTo(Book o) {
		if(this.b_id<o.b_id)
		  return this.b_id-o.b_id;
		else if(this.b_id>o.b_id)
			return this.b_id+o.b_id;
		else
			return 0;
	}

	public static void main(String[] args) {
		ArrayList<Book> l;
		l=new ArrayList<Book>();
		Book b=new Book(432, "vijeta", 25.4f);
		l.add(b);
		l.add(new Book(223, "Agni", 560.0f));
		l.add(new Book(3, "Gagan", 453.0f));
		Collections.sort(l);
		System.out.println("AFTER SORT:"+l);
		Iterator<Book> itr=l.iterator();
		while(itr.hasNext())
		{
			Book o=itr.next();
			System.out.println(o);
		}
		//System.out.println(l);
		

	}
	

}
