package objectcontainment.com;

public class PersonInfo {

	public static void main(String[] args) {
		/*Address a=new Address("Ahmednager","Maharashtra","India");
		Person p=new Person("Pradeep","male",26,a);
		System.out.println(p);*/
		
		Address a=new Address();
		a.setCity("Ahmednager");
		a.setState("maharashtra");
		a.setCountry("India");
		Person p=new Person();
		p.setName("Pradeep");
		p.setGender("male");
		p.setAge(26);
		System.out.println("Name: "+p.getName());
		System.out.println("Gender: "+p.getGender());
		System.out.println("Age: "+p.getAge());
		
		p.setObj(a);
		a=p.getObj();
		
        System.out.println("City: "+a.getCity()); 
        System.out.println("State: "+a.getState()); 
        System.out.println("Country: "+a.getCountry()); 
	}

}
