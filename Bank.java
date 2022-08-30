import asset.*;
import amount.*;
import debit.*;
import liable.*;
import java.util.Scanner;
public class Bank
{
public static int balance;
public static int credit;
public static int code;
public static int debit;
public static int code2;
public static int code1;
public static int code3;
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
Responsibility rr=new Responsibility();
Amount a=new Amount();
Credit c=new Credit();
Debit d=new Debit();
balance=a.showAmount(1000);
rr.input();
rr.show();
while(true)
{
System.out.println("Enter the choice from below\n\t 1=balance inquiry\n\t2=withdrawl\n\t 3=Deposite\n\t 4=quit");
System.out.println("choose the correct code.");
code=ss.nextInt();
switch(code)
{
case 1:
System.out.println("Your account balance is"+balance+"\n\n\n");
break;
case 2:
System.out.println("Are u want to withdraw\n\tchoose from below\n\n\t\t0=No\n\t\t1=Yes");
code1=ss.nextInt();
if(code1==1)
{
credit=c.showcredit();
balance=balance-credit;
System.out.println("Rest balance is"+balance+"\n\n\n");
}
else{
break;
}
break;
case 3:
System.out.println("Are u want to deposite\n\tchoose from below\n\n\t\t0=No\n\t\t1=Yes");
code2=ss.nextInt();
if(code2==1)
{
debit=d.showDebit();
balance=balance+debit;
System.out.println("Now your account balance is"+balance+"\n\n\n");
}
else{
break;
}
break;
default:
System.out.println("ARE U WANT TO QUIT"+"\n"+"choose from below"+"\n"+"0=No"+"\n"+"1=Yes");
code3=ss.nextInt();
if(code3==1)
{
System.out.println("THANK YOU");
System.exit(10);
}
else{
break;
}
}
}
}
}