package constructorpoly.com;

class Parent {
	
	private void display()
	{
		System.out.println("This is parent method");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.display();
		Child c=new Child();
		c.view();
		//c.display();
	}

}
class Child extends Parent 
{
	public void view()
	{
		System.out.println("This is child class");
	}
}