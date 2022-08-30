class A
	{
	public void m1()
		{		System.out.println("I am m1");
		}
	}
class B extends A
	{
	public void m2()
		{
	System.out.println("I am m2");
		}
	}
public class Demo3
	{
	public static void main(String args[])
	{
	B aa=new B();
	aa.m1();	
	aa.m2();
	}
	}