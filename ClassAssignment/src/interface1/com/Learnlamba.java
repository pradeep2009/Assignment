package interface1.com;

public class Learnlamba {

	public static void main(String[] args) {
		
		Service s=(s1,ch)->{
			return("corrier service provide "+s1+" and charges are "+ch);
		};
       String str=s.provideservice("Ganesh", 450.0f);
       System.out.println(str);
       System.out.println("--------------------------------------------");
       
       Service t=(s3,ch)->{
			return("transport service provide "+s3+" and charges are "+ch);
		};
      String str1=t.provideservice("Rahul", 2000.0f);
      System.out.println(str1);
	}

}
