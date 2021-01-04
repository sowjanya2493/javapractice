package javaPrtc;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) 
	{
		int n, c=0,a,temp;  
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the Number:");
		n=sc.nextInt();
	    //It is the number to check armstrong  
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
		

	}


