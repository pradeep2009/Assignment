package inheritance.com;

class A
{
	public void show()
	{
		System.out.println("this is a method");	
	}
	
}
class B 
{
	public void run()
	{
		System.out.println("this is a method");	
	}
	
}
public class C extends A,B
{

	public static void main(String[] args) {
		C c=new C();
		c.show();
		c.run();

	}

}
