package p1.com;

//import com.oops.Item;

public class Inventory {

	public static void main(String[] args) {
		Item i1;
	    i1=new Item();
	    i1.setItemId(101);
	    System.out.println(i1.getItemId());
	    i1=new Item();
	    i1.setItemCost(3300.50f);
	    System.out.println(i1.getItemCost());
	    i1.setItemName("Pradeep");
	    System.out.println(i1.getItemName());
	}

}
