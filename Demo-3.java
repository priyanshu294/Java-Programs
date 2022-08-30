public class Demo
	{
	int data;
	public void setData(int a)
		{
		data=a;
		}
	public int getData()
		{
		return data;
		}
	public static void main(String args[])
		{
		Demo dd=new Demo();
		dd.setData(100);
		System.out.println("data value is : "+dd.getData());
		}
	}
