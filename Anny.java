public abstract class Anny
{
String name;
int roll;
Anny()
{
System.out.println("object is contructed");
}
void call()
{
System.out.println("Annaymous inner class");
}
public abstract void setName(String name);
public abstract String getName();
public abstract void setRoll(int roll);
public abstract int getRoll();
public static void main(String args[])
{
Anny aa=new Anny() //Annaymous class
{
@Override
public void setName(String s)
{ 
name=s;
}
@Override
public String getName()
{
return name;
}
@Override
public void setRoll(int r)
{ 
roll=r;
}
@Override
public int getRoll()
{
return roll;
}
};
aa.setName("java");
System.out.println("Name is:"+aa.getName());
aa.setRoll(23);
System.out.println("Roll is:"+aa.getRoll());
aa.call();
}
}
