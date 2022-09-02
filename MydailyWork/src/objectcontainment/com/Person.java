package objectcontainment.com;

public class Person {
	
	/*String name,gender;
	int age;
	Address ad;*/
	private String name,gender;
	private int age;
	private Address ad;
	/*Person(String n,String g,int a,Address obj)
	{
		name=n;
		gender=g;
		age=a;
		ad=obj;
	}*/
	Person(){}
	public void setName(String n)
    {
    	name=n;
    }
    public String getName()
    {
    	return name;
    }
    public void setGender(String g)
    {
    	gender=g;
    }
    public String getGender()
    {
    	return gender;
    }
    public void setAge(int a)
    {
    	age=a;
    }
    public int getAge()
    {
    	return age;
    }
    public void setObj(Address o)
    {
    	ad=o;
    }
    public Address getObj()
    {
    	return ad;
    }
  /* public String toString()
   {
	   return "Person name: "+name+"\nGender: "+gender+"\nAge: "+age+"\nAddress: "+ad;
   }*/
}
