class A
	{
	public void show()
		{
		System.out.println("BBSR");
		}
	}
class B extends A
	{
	public void display()
		{
		System.out.println("CTC");
		}
	}
public class Demo2
	{
	public static void main(String args[])
	{
	B aa=new B();
	
	aa.show();
	aa.display();
	System.out.println("I am in Main");
	}
	}