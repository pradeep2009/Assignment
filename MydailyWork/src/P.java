import java.util.Arrays;

class P
{
   public static void main(String a[])
     {
           int sum=0;
          String str="af234asd324";
//          char ch[]=str.toCharArray();
//           System.out.println(Arrays.toString(ch));
//           int a1[]=new int[str.length()];
//        for(int i=0;i<ch.length;i++)
//        { 
//            if(Character.isDigit(ch[i]))
//            {
//            	if(ch[i]%2==0)
//                sum+=(int)ch[i];
//            }
//                  
//        }
//       System.out.println(sum);
          
  		for(int i=0;i<str.length();i++)
  		{
  			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
  			{
  				if(str.charAt(i)%2==0)
  				{
  					System.out.print(String.valueOf(str.charAt(i)));
  				sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
  				}
  			}
  		}
  		System.out.println("Digit addition is : "+sum);
}
}    