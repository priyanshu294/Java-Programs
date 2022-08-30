public class Demo1
	{
	static void call()
		{
		System.out.println("Class Method.");
		System.out.println(this);
		}
	public static void main(String args[])
		{
		Demo1 dd=new Demo1();
		call();
		Demo1.call();
		dd.call();
		}
	}
