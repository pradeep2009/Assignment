package methodOverriding.com;

public class Employee {
	
	int empid;
	String name;
	float sal;
	
   public double calculateSal(double amt)
	{
		return amt;
	}

}
class Hr extends Employee
{
	
	int incentive=2000;
	public double calculateSal(double amt)
	{
		amt+=incentive;
		return amt;
	}
}
class Developer extends Employee
{
	int allowance=4000;
	public double calculateSal(double amt)
	{
		amt+=allowance;
		return amt;
	}
}
class Manager extends Hr
{
	int bonus=3500;
	public double calculateSal(double amt)
	{
		amt+=bonus;
		return amt;
	}
}