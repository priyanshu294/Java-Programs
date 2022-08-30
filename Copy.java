import java.io.*;
public class Copy
	{
	public static void main(String args[])
		{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
		fis=new FileInputStream("aa.txt");
		fos=new FileOutputStream("bb.txt");
		int ch=0;
		while((ch=fis.read())!=-1)
			{
			fos.write(ch);
			}
		}catch(NullPointerException ne)
			{
			System.out.println("Construct the Object.");
			}
		catch(FileNotFoundException fe)
			{
			System.out.println("Check the path of the file.");
			}
		catch(IOException ie)
			{
			}
		finally{
		try{
		fis.close();
		fos.close();
		}catch(NullPointerException aa)
			{
			System.out.println("Caught");
			}
		catch(IOException ie)
			{
			}
		}
	}
	}

