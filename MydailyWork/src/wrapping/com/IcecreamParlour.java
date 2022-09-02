package wrapping.com;

public class IcecreamParlour {

	public static void main(String[] args) {
		Softy s = Softy.MANGO;
		Softy s1= Softy.VANILLA;
		switch(s)
		{
		case VANILLA :
			int f=s1.getPrice();
			System.out.println("Price:"+f);
			int a=s1.getQty();
			System.out.println("Quantity: "+a);
			 s1.setBill();
			 break;
		case MANGO:
			int f1=s.getPrice();
			System.out.println("Price:"+f1);
			int a1=s.getQty();
			System.out.println("Quantity: "+a1);
			 s.setBill();
			 break;
		case BUTTERSCOTH:
			int f2=s.getPrice();
			System.out.println("Price:"+f2);
			int a2=s.getQty();
			System.out.println("Quantity: "+a2);
			 s.setBill();
			 break;
			
		}
	}
}
