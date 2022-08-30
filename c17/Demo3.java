class Ex extends Exception
	{
	}
public class Demo3
	{
	static void call()throws Exception
		{
		throw new Exception();
		}
	public static void main(String args[])
		{
		int x,y;
		x=y=0;
		try{
		call();
		x++;
		}catch(Exception ee)
			{
			y++;
			}
		System.out.println(x+"\t"+y);
		}
	}

	