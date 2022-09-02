package map.com;


import java.util.HashMap;

class Student{
	
	int roll_no,marks;
	String sname;
	Student(){}
	Student(int id,String s,int m)
	{
		roll_no=id;
		sname=s;
		marks=m;
	}
	public int hashCode()
	{
		int ans;
		ans=roll_no+sname.hashCode()+(marks*2);
		return ans;
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
	   Student s=(Student)obj;
	   if(this.roll_no==s.roll_no && this.sname.equals(s.sname) && this.marks==s.marks)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
    }
	 public String toString()
	   {
		   return "\nStudent roll no: "+roll_no+"\nStudent Name: "+sname+"\nMarks: "+marks;
	   }
 }
 public class Student1
 {
	 
		public static void main(String[] args)
		{
			Student s=new Student(101, "ram", 56);
			Student s1=new Student(101,"ram", 56);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
			HashMap<Student, String> hp=new HashMap<Student, String>();
			hp.put(s1, "namrta");
			hp.put(s, "neeta");
			System.out.println(hp);
		}
	
}
