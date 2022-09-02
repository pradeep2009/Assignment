package map.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class SortByEmpId implements Comparator<Employee12>
{

	@Override
	public int compare(Employee12 o1, Employee12 o2) {
		// TODO Auto-generated method stub
		return o2.e_id-o1.e_id;
	}
	
}
class Employee12
{
	int e_id;
	String e_name;
	int esal;
	Employee12(){}
	Employee12(int id,String en,int s)
	{
		e_id=id;
		e_name=en;
		esal=s;
	}
	public String toString()
	{
		return e_id+" "+e_name+" "+esal;
	}
}

public class EmployeeEx {

	public static void main(String[] args) {
		TreeMap<Employee12, Integer> tm=new TreeMap<Employee12, Integer>(new SortByEmpId());
				tm.put(new Employee12(101,"GANESH",32422),111);
				tm.put(new Employee12(105,"SURES",6464),111);
				tm.put(new Employee12(102,"RAHUL",4644),111);
				tm.put(new Employee12(103,"SACHIN",4543),111);
				//System.out.println(tm);
				for(Map.Entry<Employee12, Integer>  lh : tm.entrySet())
				{
					System.out.println(" Employee = "+lh.getKey()+" Department = "+lh.getValue());
				}
				System.out.println("---------------------------");
	   tm=new TreeMap<Employee12, Integer>(Collections.reverseOrder(new SortByEmpId()));
		tm.put(new Employee12(101,"GANESH",32422),111);
		tm.put(new Employee12(104,"SURESH",6464),111);
		tm.put(new Employee12(102,"RAHUL",4644),111);
		tm.put(new Employee12(103,"SACHIN",4543),111);
		//System.out.println(tm);
		for(Map.Entry<Employee12, Integer>  lh : tm.entrySet())
		{
			System.out.println(" Employee = "+lh.getKey()+" Department = "+lh.getValue());
		}
		

	}

}
