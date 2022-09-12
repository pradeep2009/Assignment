package interface1.com;

public class Person {
	
	String name,address;
	int age;
	
	public void getdetails(String n,String add,int a)
	{
		name=n;
		address=add;
     	age=a;	
	}
	public void showdetails()
	{	
       System.out.println("Person name:"+name);
       System.out.println("Person Address:"+address);
       System.out.println("Person age:"+age);
	}

}
