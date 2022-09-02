package abstraction.com;

abstract class Machine{
	public void rotate(String s)
	{
		System.out.println(s+" machine is rotate ");
	}
	abstract public void crush();
}
abstract class Mixer extends Machine
{
	public void crush()
	{
		System.out.println("This is mixer crush");
		rotate("mixer");
	}
	public void blend()
	{
		System.out.println("mixer makes blend");
	}
}
class Jucier extends Machine
{
	public void crush()
	{
		System.out.println("This is crush");
		rotate("Crush");
	}
	public void filter()
	{
		System.out.println("Filter the crush");
	}
}
public class MainMachine {

	public static void main(String[] args) {
		Jucier j=new Jucier();
		j.crush();
		j.filter();
		System.out.println("-------------------------------------");
		Machine m=new Jucier();
		m.crush();
		m.rotate("soil");
		
		//Mixer mi=new Mixer();
		//mi.crush();
		//mi.blend();

	}

}
