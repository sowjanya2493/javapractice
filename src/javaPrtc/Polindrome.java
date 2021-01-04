package javaPrtc;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) 
	{
		/*1.Get the number to check for palindrome
		2.Hold the number in temporary variable
		3.Reverse the number
		4.Compare the temporary number with reversed number
		5.If both numbers are same, print "palindrome number"
		6.Else print "not palindrome number"*/
		int r,n,sum=0,temp;    
		  //int n=454;//It is the number variable to be checked for palindrome  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Number:");
		  n=sc.nextInt();
		  temp=n;    
		  while(n>0)
		  {    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		

	}


