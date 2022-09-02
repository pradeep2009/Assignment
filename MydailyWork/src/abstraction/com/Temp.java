package abstraction.com;

abstract class Abs1{
	
	abstract public void doAbs1();
	
}
abstract class Abs2{
	abstract  public void doAbs2();
	
}
class Temp extends Abs1
{
   public void doAbs1()
   {
	   System.out.println("Abstact1");
   }
   public void doAbs2()
   {
	   System.out.println("Abstact1");
   }
	public static void main(String[] args) {
		

	}

}
