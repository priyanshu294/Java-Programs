import excep.*;
import java.util.Scanner;
public class Test
	{
	static int num;
	static void call()throws ZeroException,NegativeException
		{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a number.");
		int n=ss.nextInt();
		if(n==0)
			{
			throw new ZeroException("input 0");
			}
		else if(n<0)
			{
			throw new NegativeException("input negative number");
			}else{
			num=n;
			}
		}
	static void check()throws ArmstrongException
		{
		if(num>0)
		{
		int i,j,sum=0;
		i=num;
		while(i>0)	
			{
			j=i%10;
			sum+=(j*j*j);
			i/=10;
			}
		if(sum==num)
			{
			throw new ArmstrongException("input armstrong number.");
			}else{
			System.out.println("Input number is : "+num);
			}
		}
	}
public static void main(String args[])
	{
	try{
	call();
	}catch(ZeroException ze)			
		{
		System.out.println("Reason is : "+ze.getMessage())	;
		System.out.println(ze);
		}
	catch(NegativeException ne)
		{
		System.out.println("Reason is : "+ne.getMessage());
		System.out.println(ne);
		}
	try{
	check();
	}catch(ArmstrongException ae)	
		{
		System.out.println("Reason is : "+ae.getMessage());
		System.out.println(ae);
		}
	}
	}
