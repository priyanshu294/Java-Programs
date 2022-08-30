import java.io.*;
public class Input
	{
	public static void main(String args[])
		{
		//try{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter first number.");
		int num1=Integer.parseInt(dis.readLine());
		System.out.println("Enter second number.");
		int num2=Integer.parseInt(dis.readLine());
		System.out.println("Sum is : "+(num1+num2));
		/*}catch(IOException ie)
			{
			System.out.println("Caught");
			}*/
		}
	}
