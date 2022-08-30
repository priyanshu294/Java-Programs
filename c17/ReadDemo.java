import java.io.*;
public class ReadDemo
	{
	public static void main(String args[])
		{
		String data="Java Technocrat,A/54 Saheed Nagar.";
		FileReader fr=null;
		FileWriter fw=null;					try{
		fw=new FileWriter("aa.txt");
		fw.write(data);
		}catch(Exception ee)		
			{
			System.out.println("Check The Path of the file.");
			}
		/*finally{
		try{
		fw.close();
		}catch(Exception aa)
			{
			}
		}*/
	}
	}

		
