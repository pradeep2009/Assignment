package polymorphism.com;

public class Area {
	
	public double calculateArea(float r)
	{
		return 3.14*r*r;
	}
	public int calculateArea(int l,int b)
	{
		return l*b;
	}
	public double calculateArea(float b,int h)
	{
		return 0.5*b*h;
	}

	public static void main(String[] args) {
		
		Area a1=new Area();
		System.out.println("area of circle:"+a1.calculateArea(3.4f));
		System.out.println("area of reactangle:"+a1.calculateArea(4,3));
		System.out.println("area of triangle:"+a1.calculateArea(3.4f,5));

	}

}
