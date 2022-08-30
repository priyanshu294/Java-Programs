public class Demo1
	{
	public static void main(String args[])
		{
		try{
		int i=100;
		int j=args.length;
		System.out.println("Value is : "+(i/j));
		}catch(ArithmeticException ae)
			{
			System.out.println("Please enter command line arguments.");
			System.out.println("Reason of Exception is : "+ae.getMessage());
			}
		}
	}

		