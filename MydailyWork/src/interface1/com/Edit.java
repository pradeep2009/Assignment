package interface1.com;

public interface Edit {
	
	
	void read();
	void update();
	default void write()
	{
		System.out.println("this is write method");
	}
   //protected void disp();

}
