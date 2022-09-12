package constructorpoly.com;

 class Y {
	
	public Y(int i)
	{
		System.out.println(1);
	}
	public static void main(String a[])
	{
		//Y x=new Y(4);
		X x1=new X();
	}

}
class X extends Y
{
	public X()
	{
		super(3);
		System.out.println(2);
	}
	
}
