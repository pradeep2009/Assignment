package interface1.com;

public class Magzine extends Book implements Edit {
	
	public void read()
	{
		System.out.println("Read the magazine..");
	}
	public void update()
	{
		System.out.println("update the data in magazine..");
	}
	public void write()
	{
		System.out.println("write the the magazine..");
		publish("Target publication");
	}
	

}
class Book 
{
	int b_id;
	String b_name,a_name;
	float b_cost;
	Book(){}
	Book(int id,String n,String an,float c)
	{
		
		b_id=id;
		b_name=n;
		a_name=an;
		b_cost=c;
	}
	void publish(String publication)
	{
		System.out.println("publication is: "+publication);
	}
	
	public String toString()
	{
		return "Book id: "+b_id+"\nBook name: "+b_name+"\nAuthor name: "+a_name+"\nBook cost: "+b_cost;
	}
}
class Newspaper implements Edit,Printable {
	
	public void read()
	{
		System.out.println("Read the Newspaper.. ");
	}
	public void update()
	{
		System.out.println("update the data in Newspaper.. ");
		write();
	}
	public void print()
	{
		System.out.println("newspaper is printing");
	}
	

}
