package string.com;

public class Timpass  {

	public static void main(String[] args) {
		
//     String str="Hello";
//     String s=new String("hello good morning");
//     String s1=new String("hello");
//     
//     System.out.println(str.toLowerCase());
//     System.out.println(str.toUpperCase());
//     String s4=s.substring(3,8);
//     System.out.println(s4);
//     String sub=s.replace("morning", "night");
//     System.out.println(sub);
		
		
		public boolean equals(Object anObject) {
	        if (this == anObject) {
	            return true;
	        }

		StringBuffer sb8=new StringBuffer("goodnight");
		StringBuffer sb9=new StringBuffer("goodnight");
		if(sb8.equals(sb9))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		
     
	 StringBuilder sb=new StringBuilder("hello");
     System.out.println(sb.capacity());
     sb.ensureCapacity(80);
     sb.append(" welcome");
     System.out.println(sb);
     System.out.println(sb.length());
     System.out.println(sb.capacity());
     System.out.println("-------------------");
     StringBuilder sb1=new StringBuilder("hello");
     sb1.insert(1,"w");
     System.out.println(sb1);
     System.out.println("----------------");
     StringBuilder sb2=new StringBuilder("hello good morning");
     sb2.replace(2, 6, "hee");
     System.out.println(sb2);
     System.out.println("----------------");
     StringBuilder sb3=new StringBuilder("hello good morning");
     sb3.delete(5, 12);
     System.out.println(sb3);
     System.out.println("----------------");
     StringBuilder sb4=new StringBuilder("hello good morning");
     sb4.reverse();
     System.out.println(sb4);
     
     
     
     
     //.replaceAll(regex, replacement)
     
     /*  if(str.compareTo(s)>0)
       {
    	   System.out.println("str is greater");
       }
       else if(str.compareTo(s)<0)
       {
    	   System.out.println("s is greater");
       }
       else 
       {
    	   System.out.println("both are equal");
       }*/
	}

}
