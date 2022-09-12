package constructorpoly.com;

public class Student {
   int rollno;
   String name;
   Student(){}
   Student(int n,String name)
   {
	   rollno=n;
	   this.name=name;
   }
   public void setRollno(int n)
   {
	   rollno=n;
   }
   public int getRollno()
   {
	   return rollno;
   }
   public void setName(String n)
   {
	   name=n;
   }
   public String getName()
   {
	   return name;
   }
   public String toString()
   {
	   return "Roll no: "+rollno+"\nStudent name: "+name;
   }
}
