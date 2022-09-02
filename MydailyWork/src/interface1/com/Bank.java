package interface1.com;

public class Bank implements Calculator {
	public int add(int x,int y)
	{
		return x+y;
	}
	public void muti(int a,int b)
	{
		System.out.println("Multiplication is: "+a*b);
	}
}
