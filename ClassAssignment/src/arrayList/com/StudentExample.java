package arrayList.com;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
class SortByRollno implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.roll_no-o2.roll_no;
	}
	
}
class SortByName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
class SortByAge implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.age-o2.age;
	}
	
}

class Student
{
	int roll_no;
	String name;
	int age;
	Student(){}
	Student(int n,String name,int age)
	{
		roll_no=n;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "\n"+roll_no+"\n"+name+"\n"+age;
	}
}

public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1,"Pradeep",23));
		al.add(new Student(3,"Ganesh",32));
		al.add(new Student(2,"Ramesh",21));
		al.add(new Student(4,"Aakash",22));
		al.add(new Student(5,"Rohit",34));
		//System.out.println(al);
		//Collections.sort(al,new SortByRollno());
		//Collections.sort(al,new SortByName());
		Collections.sort(al,new SortByAge());
		  Iterator itr=al.iterator();
		  while(itr.hasNext())
		  {
			  Object o=itr.next();
			  System.out.println(o);
		  }

	}

}
