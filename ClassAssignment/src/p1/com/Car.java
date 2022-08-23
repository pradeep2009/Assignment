package p1.com;

public class Car {

	 String modelname;
	static int totalCarSold=101;
	public static void run(int x)
	{
		//modelname="tata";//we can not acess non static variable in static method
	    System.out.println(totalCarSold);//in static method we access the static variable.
	}
	public void run1()    //in non static method we use static variable 
	{
	   System.out.println(totalCarSold);
	}
	public void run2()    //in non static method we use non static variable 
	{
	   System.out.println(modelname);
	}
	public static void run(float y)
	{
		//modelname="tata";//we can not acess non static variable in static method
	    System.out.println(totalCarSold);//in static method we access the static variable.
	}
	public static void main(String args[])
	{
		Car c=new Car();
		c.run1();
		c.run2();
		Car.run(2);
		System.out.println(Car.totalCarSold);
	}
}
