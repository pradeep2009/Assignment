package methodOverriding.com;

public class MainEmp {

	public static void main(String[] args) {
		Employee e;
		e=new Hr();
		double amt=e.calculateSal(30000);
        System.out.println("HR PAYMENT IS: "+amt);
        e=new Developer();
		double amt1=e.calculateSal(30000);
        System.out.println("Developer PAYMENT IS: "+amt1);
        Hr h;
        h=new Manager();
        double amt2= h.calculateSal(40000);
        System.out.println("Manager PAYMENT IS: "+amt2);
	}

}
