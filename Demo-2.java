public class Demo
	{
	int data;
	private class Inner
		{
		public void display()		
			{
			System.out.println(data++);
			}
		}

	public  void show()
		{
		data++;
		Inner ii=new Inner();
		ii.display();
		}
	public static void main(String arfgs[])
		{
		Demo dd=new Demo();
		dd.show();
		System.out.println(dd.data++);
		System.out.println(dd.data);
		}
	}