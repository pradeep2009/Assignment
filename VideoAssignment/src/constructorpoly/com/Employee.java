package constructorpoly.com;

public class Employee {
	
	int id;
	String name;
	float sal;
	Dept obj;
	Mydate m;
	Employee(int i,String n,float salary,Dept d,Mydate date)
	{
		id=i;
		name=n;
		sal=salary;
		obj=d;
		m=date;	
	}
	public String toString()
	{
		return "Employee id: "+id+"\nEmployee name: "+name+"\nEmpployee sal: "+sal+"\n"+obj+"\n"+m;
	}
  public static void main(String a[])
  {
	  Dept d=new Dept(101,"Testing");
	  Mydate m=new Mydate("wed",11,2020);
	  Employee e=new Employee(1,"Pradeep",300052.5f,d,m);
	  System.out.println(e);
  }
}
