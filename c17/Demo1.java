class ColorException extends Exception
	{
	}
class WhiteException extends Exception
	{
	}
public class Demo1
	{
	static void m1()throws ColorException
		{
		throw new ColorException();
		}
	static void m2()throws WhiteException
		{
		}
	public static void main(String args[])	
		{
		int a,b,c,d;
		a=b=c=d=0;
		try{
		m1();//generate exception
		a++;//0
		}catch(ColorException ce)
			{
			b++;//1
			}
		try{
		m2();//not generate excepiton
		c++;//1
		}catch(WhiteException we)	
			{
			d++;//0
			}
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		}
	}
