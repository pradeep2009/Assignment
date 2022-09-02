package objectcontainment.com;

public class Stayarrangement {

	public static void main(String[] args) {
		
		Outhouse o=new Outhouse(101,"Andheri east");
		Bangalow b=new Bangalow("varsha","Bandra","eknath",o);
		System.out.println(b);
				

	}

}
