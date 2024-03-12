import java.io.*;
import java.lang.*;
class Dist implements Cloneable{
	
	Double inch,feet;
	Dist(Double a,Double b){
	inch=a;
	feet=b;
}
	public Object clone(){
	try{
		return super.clone();
}
	catch(CloneNotSupportedException c){
	System.out.println("error : "+c);
return this;
}
}
}
class cloneDemo{
public static void main(String args[]){
	Dist obj1= new Dist(9.1,43.0);
	Dist obj2=(Dist)obj1.clone();
	System.out.println("inch= "+obj2.inch);
	System.out.println("feet ="+obj2.feet);
}
}