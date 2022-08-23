package methodOverriding.com;

public class MainCar {

	public static void main(String[] args) {
		
		Car co=new AcCar();
		co.drive();
	    co=new ECar(80,"hundai");
		co.drive();

	}

}
