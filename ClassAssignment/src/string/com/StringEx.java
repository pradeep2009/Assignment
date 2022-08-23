package string.com;

public class StringEx {
	
	public void character3(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=(int)ch[i]+3;
			System.out.print((char)c);
		}
			
	}
	

	public static void main(String[] args) {
		String str="sdgk";
		StringEx x=new StringEx();
		x.character3(str);

	}

}
