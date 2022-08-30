abstract class Card
{
String name;
Card()
{
System.out.println("object is const");
}
void call()
{
System.out.println("abstract class");
}
public abstract void greeting();
}
	class Season extends Card
{
Season(String name)
{
this.name=name;
}
@Override
public void greeting()
{
System.out.println("Mr."+name +" this is a season greeting for u...");
}
}
	class Birthday extends Card
{
int age;
Birthday(String name,int age)
{
this.name=name;
this.age=age;
}
@Override
public void greeting()
{
System.out.println("Mr."+name +" this is your" +age+" birthday.");
}
}
public class Abs
{
public static void main (String args[])
{
Card c1=new Season("amit");
c1.greeting();
c1.call();
Card c2=new Birthday("raj",21);
c2.greeting();
c2.call();
}
}
