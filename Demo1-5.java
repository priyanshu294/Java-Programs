import java.io.*;

public class Demo1
	{
	public static void main(String args[])throws Exception
		{
		File f=null;
	String s[]={"JT1.txt","JT2.txt","JT3.txt"};
	
	for(String a :s)
		{
		f=new File("E:/ab/"+a);
		f.createNewFile();
		}
		}
	}