package methodOverriding.com;

 class A
{
	 
	 final String s;
	 A()
	 {
		  s="parent";
		   
	 }
	 public static void calculateSal()
	 {
		 System.out.println("calculate salary");
	 }
	 public void install()
	 {
		  int x=76;
		  System.out.println(x);
		  x=87;
		  System.out.println(x);
		 System.out.println("calculate salary");
	 }
}
class B extends A
{
	 String s="child";
	 public static void calculateSal()
	 {
		 System.out.println("calculate salary B");
	 }
	 public void install()
	 {
		 System.out.println("calculate salary");
	 }
	
}
public class Variablecheck {

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.s);
		a.install();
		//a.s="parent1";
		System.out.println(a.s);
		B b=new B();
		System.out.println(b.s);
		A a1=new B();
		a1.calculateSal();
		
        System.out.println(a1.s);
	}

}
