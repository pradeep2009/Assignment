package abstraction.com;

abstract class Parent
{
	abstract public void cook();
	public void wash()
	{
		System.out.println("parent wash method");
	}	
}
class Child extends Parent
{
	public void cook()
	{
		System.out.println("child cook method");
		wash();
	}
}
public class Housework {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.cook();

	}

}
