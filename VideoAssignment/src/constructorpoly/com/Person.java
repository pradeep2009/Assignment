package constructorpoly.com;

public class Person {
      int id;
      String name;
      Job obj;
      public Person(int i,String n,Job j) {
    	  id=i;
    	  name=n;
    	  obj=j;	
	}
      public String toString()
      {
    	  return "Person id:"+id+"\nPerson name: "+name+"\n"+obj;
      }
      public static void main(String[] args) {
		JoiningDate j=new JoiningDate("WED", 8, 2022);
		Job j1=new Job(202, "Developer", j);
		Person p=new Person(401, "Pradeep", j1);
		System.out.println(p);
	}
}
