package p1.com;

public class Ipl {
	
	
	public static void main(String[] args) {
		
		Member m1[]=new Member[2];
	    m1[0]=new Member(101,"Dhoni", 200, 32);
		m1[1]=new Member(102,"Raina", 150, 31);
		Team t=new Team("csk",12,"priti",m1);
		t.selectTeam();
		t.showTeam();
		
	}


}
