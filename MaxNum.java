import java.io.*;
import java.lang.*;

public class MaxNum
{
public static void main(String args[])
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

System.out.println("Enter c: ");
dis=new DataInputStream(System.in);
s=dis.readLine();
int c=Integer.parseInt(s);

int max;
if(a>=b&&a>=c)
{
System.out.println("max: "+a);
}
else if(b>=a&&b>=c)
{
System.out.println("max: "+b);
}
else
{
System.out.println("max: "+c);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
