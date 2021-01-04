package javaPrtc;

import java.util.Scanner;

public class EvenRodd {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter num:");
		int num=reader.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"num is even ");
			
		}else {
			System.out.println(num+"num is odd");
		}

	}

}
