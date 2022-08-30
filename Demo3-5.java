import java.io.*;
public class Demo3
	{
	public static void main(String args[])
		{
		File f=new File("E:/p1/Java");
		if(f.mkdir())
			{
			System.out.println("Created");
			}else{
		System.out.println("Already Present");
			}
		}
	}
		