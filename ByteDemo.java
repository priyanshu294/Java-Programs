import java.io.*;
public class ByteDemo
	{
	public static void main(String args[])
		{
		try{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the data");
		String data=dis.readLine();
		System.out.println("Write the data on the buffered area.");
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		byte bb[]=data.getBytes();
		bos.write(bb);
		System.out.println("\nWrite the data of buffer on a file");
		FileOutputStream fos=new FileOutputStream("cc.txt");
		bos.writeTo(fos);
		System.out.println("\nRead first 50 byte from the buffer.");
		byte input[]=bos.toByteArray();
		ByteArrayInputStream bis=new ByteArrayInputStream(input,0,50);
		int ch=0;
		while((ch=bis.read())!=-1)
			{
			System.out.print((char)ch);
			}
		System.out.println("\nRead the data from the file.");
		FileInputStream fis=new FileInputStream("cc.txt");
		while((ch=fis.read())!=-1)
			{
			System.out.print((char)ch);
			}
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		}catch(Exception ee)
			{
			ee.printStackTrace();
			}
		}
	}

		