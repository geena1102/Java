 import java.io.*;

class Product
{
	public static void main(String args[])
	{
		DataInputStream din;
		int a,b;
		String s;
		din=new DataInputStream(System.in);
		try
		{
		 System.out.println("Enter the first number:");
		 s=din.readLine();
		 a=Integer.parseInt(s);
		 System.out.println("Enter the second number:");
		 s=din.readLine();
		 b=Integer.parseInt(s);
		 System.out.println("Product of " +a+ " and " +b+ " is: " +(a*b));
		}
		catch(Exception e)
		{
		 System.out.println("Error is:"+e);
		}
	}
}
