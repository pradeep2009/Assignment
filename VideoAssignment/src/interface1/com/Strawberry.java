package interface1.com;

class Strawberry implements Cake {
	
	public void bake()
	{
		System.out.println("Strawberry cake is bake");
	}
	public static void main(String[] args) {
		Cake c;
		c=new Strawberry();
		c.bake();
		c=new Blackforest();
		c.bake();
	}

}
class Blackforest implements Cake{
	
	public void bake()
	{
		System.out.println("Blackforest cake is bake");
	}
	
}
