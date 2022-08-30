class Ex1 extends Exception
	{
	}
class Ex2 extends Ex1
	{
	}
class Ex3 extends Ex2
	{
	}
public class Demo
	{
	public static void main(String args[])
		{
		int a,b,c,d,e,f;
		a=b=c=d=e=f=0;
		try{
		int x=1;
			try{
			switch(x)
				{
				case 1:
				throw new Ex1();
			
				case 2:
				throw new Ex2();
		
				case 3:
				throw new Ex3();
				}
			a++;//0
			}catch(Ex2 ee2)
				{
				b++;//0
				}
			finally{
			c++;//1
			}
		}catch(Ex1 ee1)
			{
			d++;//1
			}
		catch(Exception ee)	
			{
			e++;//0
			}
		finally{
		f++;//1
		}
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f)	;
	}
	}
	
		