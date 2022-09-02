package abstraction.com;

abstract public class Shape {
	abstract public void describeShape();
	public void fillColor(String s)
	{
		System.out.println("Filled color"+s);
	}

}
class Geometricshape extends Shape
{
	public void drawShape()
	{
		System.out.println("Drawing geometrical shape");
	}
	public void describeShape()
	{
		fillColor("black");
		System.out.println("This is geometric shape");
	}
}
class Freehandshape extends Shape
{
	public void drawShape()
	{
		System.out.println("Drawing geometrical shape");
	}
	public void describeShape()
	{
		System.out.println("This is Freehandshape shape");
	}
}
