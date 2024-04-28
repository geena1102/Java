import java.io.*;
import java.lang.*;
public class NumSum
{
public static void main(String aargs[])
{
try
{
String s;

System.out.println("Enter a: ");
DataInputStream dis=new DataInputStream(System.in);
s=dis.readLine();
int a=Integer.parseInt(s);

System.out.println("Enter b: ");
dis=new DataInputStream(System.in);
s=dis.readLine();
int b=Integer.parseInt(s);

int sum=a+b;

System.out.println("a: "+a);
System.out.println("b: "+b);
System.out.println("Sum of " +a+ " and " +b+ " is " +sum);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
