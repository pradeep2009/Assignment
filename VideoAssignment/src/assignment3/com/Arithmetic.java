package assignment3.com;

public class Arithmetic {
	
	public int add(int x,int y)
	{
		return x+y;
	}
	public int sub(int x,int y)
	{
		return x-y;
	}
	public int mult(int x,int y)
	{
		return x*y;
	}
	public float div(int x,int y)
	{
		return x/y;
	}

	public static void main(String[] args) {
		
		Arithmetic a1=new Arithmetic();
		
		System.out.print("Addition: "+a1.add(11, 15)+"\n");
		System.out.print("Subtraction: "+a1.sub(11, 15)+"\n");
		System.out.print("Multiplication: "+a1.mult(11, 15)+"\n");
		System.out.print("Division: "+a1.div(15, 3)+"\n");
		

	}

}
