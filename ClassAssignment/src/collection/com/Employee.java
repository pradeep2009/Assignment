package collection.com;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
	int e_id;
	String e_name,e_country;
	int e_age;
	Employee(int id,String s,String ec,int f)
	{
		e_id=id;
		e_name=s;
		e_country=ec;
		e_age=f;
		
	}
	public String toString()
	{
		return "\nEmployee id:"+e_id+"\nEmployee Name:"+e_name+"\nEmployee country:"+e_country+"\nEmployee Age: "+e_age;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.e_name.equals(o.e_name))
		{
			if(this.e_id>o.e_id)
			{
				return 1;
			}
			else if(this.e_id<o.e_id)
			{
				return -1;
			}
			else
				return 0;
		}
		else
		{
		return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l;
		l=new ArrayList<Employee>();
		Employee b=new Employee(1, "Ganu","India", 52);
		l.add(b);
		l.add(new Employee(8, "Abhi","US", 56));
		l.add(new Employee(5, "Gana","UK",33));	
		l.add(new Employee(4, "Abhi","sri lanka", 34));
		l.add(new Employee(2, "Abhi","france",56));
		l.add(new Employee(6, "Abhi2","china", 36));
		Collections.sort(l);
		System.out.println(l);
	}
	

}
