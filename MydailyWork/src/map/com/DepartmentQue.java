package map.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee1
{
	ArrayList<Employee1> e ;
	int e_id,salary,dept_id;
	String ename;
	public Employee1() {
	}
	Employee1(int id,String n,int sal,int did)
	{
		e_id=id;
		ename=n;
		salary=sal;
		dept_id=did;
	}
	public String toString()
	{
		return "\n"+e_id+"\n"+ename+"\n"+salary+"\n"+dept_id+"\n";
	}
	public boolean equals(Object obj) 
	{
        if(this == obj)
        {
        	return true;
        }
	   if(obj==null)
	   {
		return false;
	   }
	   if(this.getClass() != obj.getClass()) 
      {
	    return false;
      }
	   Employee1 s=(Employee1)obj;
	   if(this.e_id==s.e_id && this.ename.equals(s.ename) && this.salary==s.salary && this.dept_id==s.dept_id)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
    }
	public int hashcode()
	{
		int ans;
		ans=e_id+ename.hashCode()+(salary*2)+dept_id;
		return ans;
	}
	
	public void createlist()
	{
		e=new ArrayList<Employee1>();
		e.add(new Employee1(1232, "vikas", 8000, 111));
		e.add(new Employee1(1236, "Ram", 6000, 113));
		e.add(new Employee1(1233, "Amol", 3000, 112));
		e.add(new Employee1(1237, "Nikhil", 7000,114));
		e.add(new Employee1(1234, "vikas", 2300, 111));
		e.add(new Employee1(1235, "Ganesh", 8000, 112));
		//System.out.println(e);
		mapcheck(e);
	}
	public void mapcheck(ArrayList<Employee1> e)
	{
		  HashMap<Integer, Integer> hp=new HashMap<Integer, Integer>();
		 
	
		  Iterator<Employee1> itr=e.iterator();
		  while(itr.hasNext())
		  {
			  Employee1 c=itr.next();
			        
					   
					   Integer sal=hp.put(c.dept_id,c.salary);
					   
			         if(sal!=null)
			         {
			        	 hp.put(c.dept_id,sal+c.salary);
			         }
			      
			  }
			  
			  
		  
		    Set set=hp.entrySet(); 
	        Iterator itr1=set.iterator();  
	        while(itr1.hasNext()){  
	            
	            Map.Entry entry=(Map.Entry)itr1.next();  
	           
	            System.out.println("Dept id:"+entry.getKey()+" "+"Total expense: "+entry.getValue());  
	        }  
		
	}
}

public class DepartmentQue {

	public static void main(String[] args) {
		
		Employee1 dq=new Employee1();
		dq.createlist();
        
	}

}
