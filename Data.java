import java.io.*;
public class Data
	{
	public static void main(String args[])
		{
		String name="Amit Kumar";
		int roll=12;
		double fee=45000.99;
		char gender='M';
		boolean data=true;
		try{
		FileOutputStream fos=new FileOutputStream("dd.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF(name);
		dos.writeInt(roll);
		dos.writeDouble(fee);
		dos.writeChar(gender);
		dos.writeBoolean(data);
		fos.close();
		dos.close();

		System.out.println("\nRead the data from the file in high level form.\n");
		FileInputStream fis=new FileInputStream("dd.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println("Name is : "+dis.readUTF());
		System.out.println("Roll number is : "+dis.readInt());
		System.out.println("Fee is : "+dis.readDouble());
		System.out.println("Gender is : "+dis.readChar());
		System.out.println("Data is : "+dis.readBoolean());
		fis.close();
		dis.close();
		}catch(FileNotFoundException fe)
			{
			System.out.println("File Not Found.");
			}
		catch(IOException ie)
			{
			}
		}
	}

	
	
		
	