package methodOverriding.com;

public class Mainelc {

	public static void main(String[] args) {
		
		ElecDevice el;
		el=new Tv();
		el.doSale(25,250f);
		el=new WashingMachine();
		el.doSale(35,679f);
       el=new Fridge();
       el.doSale(56,765f);
	}

}
