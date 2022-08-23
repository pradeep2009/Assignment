package methodOverriding.com;

public class Car {
	int speed;
	String cname;
	Car(){
		speed=120;
		cname="tata";
	}
	Car(int s,String cname)
	{
		speed=s;
		this.cname=cname;
	}
	public void drive()
	{
		System.out.println("you drive car");
	}
}
 class AcCar extends Car
{
	AcCar()
	{
		super();
	}
	public void drive()
	{
		super.drive();
		System.out.println("you drive car "+cname+" with speed "+speed);
	}
}
class ECar extends Car
{
	ECar(int s,String c)
	{
		super(s,c);
	}
	public void drive()
	{
		System.out.println("you drive car "+cname+" with speed "+speed);
	}
}
