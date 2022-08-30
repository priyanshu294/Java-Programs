public class Text4
	{
	static void get()
		{
		try{
		System.out.println("I am in try block.");
		System.out.println(100/0);
		}catch(NumberFormatException ae)
			{
			System.out.println("I am in catch block.");
			
			}finally{
			System.out.println("I am in finally block.");
			return;
			}
		}
	public static void main(String args[])	
		{
		get();
		}
	}
	
	