public class Demo1
	{
	String name;
	protected class Inner
		{
		void show()
			{
		System.out.println("Name is "+name); 
			}
		}
	public static void main(String args[])
		{
		Demo1 dd=new Demo1();
		Inner ii=dd.new Inner();
		ii.show();
		System.out.println("I am in  main");
		}
	}