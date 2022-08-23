package p1.com;

public class FinalDemo {
	final int x;
    FinalDemo()
    {	
    	x=56;
    }
    public void method2()
    {
    	System.out.println("this is final demo method");
    }
}
class FinalDemoChild extends FinalDemo
{
	public void method2()
	{
		System.out.println("this is final demo child method");
	}
}
class FinalDemoChild1 extends FinalDemoChild
{
	public void method2()
	{
		System.out.println("this is final demo child1 method");
	}
}