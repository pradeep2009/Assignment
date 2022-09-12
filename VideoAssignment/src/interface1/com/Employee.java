package interface1.com;

public class Employee extends Person implements TaxPayer{

	int emp_id;
	int ba,hra,da;
	float grosssal;
	
	Employee(int id,int basic,int hra,int da)
	{
		emp_id=id;
		ba=basic;
		this.hra=hra;
		this.da=da;
	}
	public void show()
	{
		System.out.println("Emp id: "+emp_id);
		System.out.println("Emp Basic: "+ba);
		System.out.println("Emp HRA: "+hra);
		System.out.println("Emp DA: "+da);
	}
	public void calculateSal()
	{
		grosssal=ba+hra+da;
		System.out.println("Gross salary is: "+grosssal);
	}
	
	public void payTax() {
		float tax=(grosssal*5)/100;
		System.out.println("payes taxes: "+tax);
	}
}
class VP extends Employee{
	VP()
	{
	   super(1,50000,2000,500);
	   getdetails("Pradeep","Nager", 26);
	   showdetails();
	   show();
	   calculateSal();
	   payTax();
	}
	
	   
}