package interface1.com;
abstract  class Sample{
	abstract void m3();
	public static void m4() {}
	public final void m5() {}
}
public class Test extends Sample implements intrrupt {
	
	public void m1()
	{}
	public void m2()
	{}
    public void m3()
    {}
    public static void m4() {}
    //public final void m5() {}
	public static void main(String[] args) {
		
           //Test t=new Test();
           //m1();
	}
	

}
interface intrrupt{
	public  void m1();
	void m2();
	static int var=233;
}
