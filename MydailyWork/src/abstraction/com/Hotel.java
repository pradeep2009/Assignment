package abstraction.com;

abstract class Food
{
	abstract void prepareFood();
	abstract public void ingredientFood();
	public void parsalFood(String s)
	{
		System.out.println("Parsal of food is: "+s);
	}
}
abstract class Paratha extends Food
{
	
	abstract public void parathaChecking();	
}
class AalooParatha extends Paratha
{
	public void prepareFood()
	{
		System.out.println("preapare paratha");
		
	}
	public void ingredientFood()
	{
		System.out.println("Ingredient: onion,ghee,chilli pepper,flour");
		parsalFood("AlooParatha");
	}
	public void parathaChecking()
	{
		System.out.println("this is the aaloparatha");
	}
}
class Omlet extends Food
{
	public void prepareFood()
	{
		System.out.println("Preapare omlet");
		
	}
	public void ingredientFood()
	{
		System.out.println("Ingredient: eggs,onion,oil,green chill");
		parsalFood("omlet");
	}
}

public class Hotel {

	public static void main(String[] args) {
		
		/*Food f=new Omlet();
		f.prepareFood();
		f.ingredientFood();
		
		Food f1=new Paratha();
		f1.ingredientFood();
		f1.prepareFood();*/
		
		Paratha p=new AalooParatha();
		p.parathaChecking();
		p.prepareFood();
		p.ingredientFood();
		

	}

}
