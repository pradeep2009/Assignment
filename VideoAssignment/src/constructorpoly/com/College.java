package constructorpoly.com;

public class College {

	public static void main(String[] args) {
		/*Student s;
		s=new Student(101,"pradeep");
		Department d=new Department(201,"SCIENCE",s);
		System.out.println(d);*/
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("pradeep");
		Department d=new Department();
		d.setDept_id(203);
		d.setDept_name("science");
		d.setStudent(s);
		System.out.println("Dept Id: "+d.getDept_id());
		System.out.println("Dept Name: "+d.getDept_name());
		System.out.println(d.getObj());

	}

}
