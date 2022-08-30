public class Demo3
	{
	void display()
		{
System.out.println("I am in display()");
	int a=12;
		}
		
	public void call(int b,final int c)
		{
		final int x=b+c;
		int y=b-c;
		
		class Inner1
			{
			void show()
				{
	System.out.println(x+"\t"+ y);
				}
			}
		Inner1 ii=new Inner1();
		ii.show();
		}
	public static void main(String args[])
	{
	Demo3 dd=new Demo3();
	dd.call(12,22);
	dd.display();
	}
	}
	
		
		