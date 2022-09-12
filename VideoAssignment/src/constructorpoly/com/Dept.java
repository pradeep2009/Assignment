package constructorpoly.com;

public class Dept {
	
	int dept_id;
	String dept_name;
	Dept(int did,String dname)
	{
		dept_id=did;
		dept_name=dname;
	}
	public String toString()
	{
		return "Dept_id: "+dept_id+"\nDept name: "+dept_name;
	}

}
