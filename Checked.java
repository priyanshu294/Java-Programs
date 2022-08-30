public class Checked
	{
	static void m1()
		{
		System.out.println("Checked Exception.");
		try{
		throw new Exception();
		}catch(Throwable ee)
			{
			System.out.println("Caught Exception.");
			}
		System.out.println("Method is Exception free.");
		}
	static void m2()
		{
		throw new Exception();
		}
	public static void main(String args[])	
		{
		m1();
		try{
		m2();
		}catch(Exception ee)	
			{
			System.out.println("Handle Exception at calling time.");
			}
	}	
	}
	