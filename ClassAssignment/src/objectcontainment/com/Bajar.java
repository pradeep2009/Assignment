package objectcontainment.com;

public class Bajar {

	public static void main(String[] args) {
		Shop s=new Shop();
		s.setShop_id(444);
		s.setShop_area("nager");
		s.setShop_name("ganapat");
		
		
		Market m1=new Market();
		m1.setMarket_id(108);
		m1.setMarket_name("pradeep");
		m1.setMarket_area("nager");
		m1.setObj(s);
		
        System.out.println(m1);
        System.out.println("-----------------------------------------");
	}

}
