package inheritance.com;

class Shape
{
	   public void display()
	   {
	      System.out.println("Inside display");
	   }
}
class Rectangle extends Shape {
	  public void area() 
	  {
	      System.out.println("Inside area");
	   }
}
class Square extends Rectangle
{
	   public void volume() 
	   {
	      System.out.println("Inside volume");
	   }
	}
public class Main2
{
	   public static void main(String[] arguments)
	   {
	      Square s = new Square();
	      s.display();
	      s.area();
	      s.volume();
	   }
}
