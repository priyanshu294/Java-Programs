public class Text1
	{
	static int get()
		{
		try{
		System.out.println("I am in try block.");
		return 1;
		}catch(ArithmeticException ae)
			{
			System.out.println("I am in catch block.");
			return 2;
			}finally{
			System.out.println("I am in finally block.");
			return 3;
			}
		}
	public static void main(String args[])	
		{
		System.out.println("Value is : "+get());
		}
	}
	
	