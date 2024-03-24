import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Cstr{
	static void length(String name1,String name2){
		System.out.println("Length of the first string is : "+name1.length());
		System.out.println("Length of the second string is : "+name2.length());
}
static void compare(String name1,String name2){
	System.out.println(name1==name2);
}

static void substr(String name1){
	System.out.println("Substring of "+ name1+" is "+name1.substring(3));
}
static void lowercase(String name1,String name2){
System.out.println(name1.toLowerCase());
System.out.println(name2.toLowerCase());
}
public static void main(String args[]){
try{
String name1,name2;
int c,ch=1;

DataInputStream dir=new DataInputStream(System.in);
Scanner console=new Scanner(System.in);

System.out.println("First string : ");
name1 = console.nextLine();

System.out.println("Second string : ");
name2 = console.nextLine();

do{
System.out.println("1.Length\n2.Compare\n3.Substring\n4.Lowercase\n");
c=Integer.parseInt(dir.readLine());

switch(c){

	case 1:
		length(name1,name2);break;
	case 2:
		compare(name1,name2);break;
	case 3:
		substr(name1);break;
	case 4:
		lowercase(name1,name2);break;

}
System.out.println("Do you want to continue (1/0) ");
ch=Integer.parseInt(dir.readLine());
}while(ch==1);

}
catch(Exception e){
	System.out.println("error "+e);
}
}
}