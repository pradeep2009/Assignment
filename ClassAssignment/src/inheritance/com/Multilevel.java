package inheritance.com;

public class Multilevel {

	public static void main(String args[])
	{
	 Science obj=new Science(); 
	 obj.total_sal=obj.salary+obj.hra+obj.da+obj.bonous;
	 System.out.println("Total Salary is:"+obj.total_sal);   
	}  
	

}
