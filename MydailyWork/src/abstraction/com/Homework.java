package abstraction.com;

class A
{
	 int eid;
	 String empname;
	 float esal;
	 static int var=90;
	 static final int var1=89;
	 static public void disp()
	 {
		 
	 }
	A(int no,String name,float sal)
	{
		eid=no;
		empname=name;
		esal=sal;
	}
}
class B extends A
{
	B()
	{
		super(101,"Pradeep",35000.8f);
	}
}
public class Homework {

	public static void main(String[] args) {
		A a=new B();
		System.out.println("Eid: "+a.eid);
		System.out.println("EmpName: "+a.empname);
		System.out.println("EmpSal: "+a.esal);

	}

}
