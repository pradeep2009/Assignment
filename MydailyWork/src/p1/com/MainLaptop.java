package p1.com;

public class MainLaptop {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setNo_of_usbport(2);
		l.setProcessor_speed(3000);
		System.out.println("Usb port of laptop is "+l.getNo_of_usbport());
		System.out.println("processor speed of laptop is: "+l.getProcessor_speed());
	}

}
