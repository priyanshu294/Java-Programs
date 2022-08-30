import java.io.*;
public class Buffer
	{
	public static void main(String args[])
		{
		try{
		BufferedOutputStream bos=new BufferedOutputStream(System.out);
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("ByteDemo.java"));
		int ch=0;
		while((ch=bis.read())!=-1)
			{
			bos.write(ch);
			}
		bis.close();
		bos.close();
		}catch(FileNotFoundException fe)
			{
			System.out.println("File Not Found.");
			}
		catch(IOException ie)	
			{
			}
		}
	}
