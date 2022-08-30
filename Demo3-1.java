public class Demo3
	{
	public static void main(String args[])
		{
		//Test t1=new Test();//error

		Test a=Test.getObject();
		a.setData(11);
		System.out.println("For first object data value is : "+a.getData());
		a.data++;

		Test b=Test.getObject();
		b.setData(17);
		System.out.println("for second object data value is : "+b.getData());
		}
	}
