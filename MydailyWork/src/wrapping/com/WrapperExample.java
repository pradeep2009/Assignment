package wrapping.com;

public class WrapperExample {

	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println("--------------");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("------------------");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println("-----------------------");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		char ch='h';
		Character c1=Character.valueOf(ch);
		System.out.println(c1);
		System.out.println("-----------------");
		int i=23;
		Integer o1=Integer.valueOf(i);
		System.out.println(o1);
		System.out.println(o1.hashCode());
		int k=o1.intValue();
		System.out.println("After unboxing:"+k);
		System.out.println("--------------------");
//		Integer o2=Integer.valueOf("84",8);
//		System.out.println(o2);
		float f=42.42f;
		Float o3=Float.valueOf(f);
		System.out.println(f);
		
		float l=o3.floatValue();
		System.out.println(l);
	}

}
