package interface1.com;

public class Mastani implements Icecream,Juice {
	
	public void eat()
	{
		System.out.println("eat the mastani");
	}
	public void drink()
	{
		System.out.println("drink the mastani");
	}

	public static void main(String[] args) {
		Mastani m=new Mastani();
		m.eat();
		m.drink();

	}

}
