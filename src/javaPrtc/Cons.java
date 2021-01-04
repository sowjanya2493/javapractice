package javaPrtc;

public class Cons 
{

	
	Cons()
		   
	{
			System.out.println("MyParentClass Constructor");
		   
	}
		
}
		
class MyChildClass extends Cons
{
		   
	MyChildClass() 
		   
	{
			System.out.println("MyChildClass Constructor");
		   
	}


public static void main(String args[])
{
			
new MyChildClass();
}
}
	   


