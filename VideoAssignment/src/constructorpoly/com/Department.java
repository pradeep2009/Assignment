package constructorpoly.com;

public class Department {
	int dept_id;
	String dept_name;
	Student obj;
	Department(){}
	Department(int id,String dname,Student ob)
	{
		dept_id=id;
		dept_name=dname;
		obj=ob;
	}
	public void setDept_id(int n)
	{
		dept_id=n;
	}
	public void setDept_name(String n)
	{
		dept_name=n;
	}
	public void setStudent(Student s)
	{
		obj=s;
	}
	public int getDept_id()
	{
		return dept_id;
	}
	public String getDept_name()
	{
		return dept_name;
	}
	public Student getObj()
	{
		return obj;
	}
   /*public String toString()
   {
	   return "Dept id: "+dept_id+"\nDept name:"+dept_name+"\n"+obj;
   }*/
}
