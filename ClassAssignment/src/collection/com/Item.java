package collection.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Item implements Comparable<Item>,Comparator<Item> {
	
	int item_id;
	String item_name;
	float item_price;
	Item(){}
	Item(int id,String is,float pr)
	{
		item_id=id;
		item_name=is;
		item_price=pr;
	}
	public String toString()
	{
		return "\nItem id: "+item_id+"\nItem_name: "+item_name+"\nItem_price: "+item_price;
	}

	public static void main(String[] args) {
		ArrayList<Item> l=new ArrayList<Item>();
		Item b=new Item(1, "Ganu", 5203.43f);
		l.add(b);
		l.add(new Item(4,"add",53412.45f));
		l.add(new Item(5,"ewrw",3214.45f));
		l.add(new Item(2,"ewrw",2244.45f));
		Collections.sort(l);
		System.out.println(l);
		System.out.println("------------------------------");
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
	}

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return (int) (o1.item_price-o2.item_price);
	}

	@Override
	public int compareTo(Item o) {
		if(this.item_price<o.item_price)
		{
			return 1;
		}
		else if(this.item_price>o.item_price)
		{
			return -1;
		}
		return 0;
	}

}
