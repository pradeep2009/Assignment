package arrayList.com;

import java.util.ArrayList;

public class Employee {
	
	int e_id;
	String e_name;
	float esal;
	Employee(int id,String name,float sal)
	{
		e_id=id;
		e_name=name;
		esal=sal;
	}
   public String toString()
   {
	   return "\nEmployee id: "+e_id+"\nEmployee Name: "+e_name+"\nEmployee sal: "+esal;
   }
	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<>();
        l.add(new Employee(1, "pradeep", 250.5f));
        l.add(new Employee(2, "sunny", 450.5f));
        System.out.println(l);
	}

}
