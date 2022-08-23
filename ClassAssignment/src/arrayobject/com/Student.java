package arrayobject.com;

public class Student
{
	int roll_no;
	String sname;
	Student(int id,String s)
	{
		roll_no=id;
		sname=s;
	}
	/*@Override
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
	   Student s=(Student)obj;
	   return this.sname.equals(s.sname) && this.roll_no==s.roll_no;
    }*/


	public static void main(String[] args) {
		Student s=new Student(1,"xyz");
		Student s1=new Student(1,"xyz");
		System.out.println(s==s1);//check memory address.
        System.out.println(s.equals(s1));//
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
	}

}
