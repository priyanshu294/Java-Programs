package debit;
import java.util.Scanner;
public class Debit
{
public int debit;
public int showDebit()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter how much you want to deposite to the account");
debit=ss.nextInt();
return debit;
}
}