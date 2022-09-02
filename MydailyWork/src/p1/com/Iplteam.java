package p1.com;

public class Iplteam {
	
	public void play()
	{
		System.out.println("Ipl team played method");
	}

}
/*class RCB extends Iplteam
{
	public void play()
	{
		System.out.println("RCB will be played");
	}
}
class CSK extends Iplteam
{
	public void play()
	{
		System.out.println("CSKs will be played");
	}
}*/
class Team extends Iplteam
{
	String tname;
	int no_of_player;
	String owner;
	Member[] mbs;
	Team()
	{
		tname="csk";
		no_of_player=11;
		owner="priti";
		
	}
	Team(String t,int n,String o,Member[] m)
	{
		tname=t;
		no_of_player=n;
		owner=o;
		mbs=m;
		
	}
	public void selectTeam()
	{
		System.out.println("You have selected: "+tname);
	}
	public void showTeam()
	{
		for(Member m:mbs)
		{
			System.out.println(m);
		}
		System.out.println("Team name: "+tname);
		System.out.println("Player:"+no_of_player);
		System.out.println("Owner name: "+owner);
	}
	
}
class Member 
{
	int mid;
	String mname;
	int mage,no_of_match_played;
	Member(int mid,String mname,int no,int mage)
	{
		
		this.mid=mid;
		this.mname=mname;
		this.mage=mage;
		no_of_match_played=no;	
	}
  
   public String toString()
   {
	  
	   String str= "Member Id: "+mid+"\nMember Name: "+mname+"\nMember age: "+mage+"\nNo_of_match_played: "+no_of_match_played;
       return str;
   }
	
}


	
