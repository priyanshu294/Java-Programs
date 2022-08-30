public class Text3
	{
	static int get()
		{
		try{
		System.out.println("I am in try block.");
		System.out.println(100/0);
		return 1;
		}catch(NumberFormatException ae)
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
	
	