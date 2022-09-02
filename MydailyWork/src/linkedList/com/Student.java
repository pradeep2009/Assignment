package linkedList.com;

public class Student {
	int rno;
	String sname;
	Student next;
	Student(int id,String s)
	{
		rno=id;
		sname=s;
	}
  
	public static void main(String[] args) {
		Student s=new Student(23,"ganesh");
		Student s1=new Student(26,"ganu");
		Student s2=new Student(26,"ganu");
        s.next=s1;
        s1.next=s2;
        System.out.println(s2.hashCode());
        Student d=s1.next;
        System.out.println(d.hashCode());
	}

}
