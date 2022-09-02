package map.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class Employee {
	
	int e_id;
	String e_name;
	int esal;
	String dept;
	Employee(int id,String name,int sal,String dept)
	{
		e_id=id;
		e_name=name;
		esal=sal;
		this.dept=dept;
	}
   public String toString()
   {
	   return "\nEmployee id: "+e_id+"\nEmployee Name: "+e_name+"\nEmployee sal: "+esal+"\nEmployee Dept: "+dept;
   }
   public int hashCode()
	{
		return e_name.hashCode()+dept.hashCode()+e_id+esal;
	}
	public boolean equals(Object obj) 
	{
       if(this == obj)
       {
       	return true;
       }
	   if(obj==null || this.getClass() != obj.getClass()) 
	   {
		return false;
	   }
	   Employee s=(Laptop)obj;
	   return this.os_name.equals(s.os_name) && this.brand_name.equals(s.brand_name) && this.price==s.price;
   }
	public static void main(String[] args) {
		/*ArrayList<Employee> l=new ArrayList<>();
        l.add(new Employee(1, "pradeep", 250.5f,"Sales"));
        l.add(new Employee(2, "sunny", 450.5f,"R&D"));
        l.add(new Employee(2, "sunny", 450.5f,"Account"));
        System.out.println(l);*/
		
		Employee e1=new Employee(1, "pradeep", 250,"Sales");
		Employee e2=new Employee(2, "sunny", 450,"R&D");
		Employee e4=new Employee(1, "pradeep", 250,"Sales");
		Employee e5=new Employee(1, "pradeep", 250,"Sales");
		Employee e3=new Employee(2, "sunny", 450,"Account");
		HashSet<Employee> hs=new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		 Iterator<Employee> sa=hs.iterator();
	 		while(sa.hasNext())
	 		{
	 			Employee o=sa.next();
	 			System.out.println(o.dept);
	 		}
	}

}
