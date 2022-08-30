public class text
	{
	static void m1()
		{
		String s=null;
		try{
		System.out.println("Size of String is : "+s.length());
		}catch(NullPointerException ne)
			{
			System.out.println("Caught NullPointerException");
			}
		finally{
		System.out.println("Initialize String Object.");
		}
		}
	static void m2()
		{
		byte b[]={65,66,67};
		try{
		String ss=new String(b,2,2);	
		System.out.println(ss);
		}catch(ArrayIndexOutOfBoundsException ae)
			{
			System.out.println("Caught.");
			}
		finally{
		System.out.println("Construct String another time.");
		}
		}
	public static void main(String args[])
		{
		try{
		System.out.println(10/args.length);
		}catch(ArithmeticException ae)
			{
			System.out.println("Caught Exception.");
			}
		finally{
		System.out.println("Enter command line arguments.");
		}
		m1();
		m2();
		}
	}
	
		

		

	