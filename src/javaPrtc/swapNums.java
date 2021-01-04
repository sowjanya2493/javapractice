package javaPrtc;

public class swapNums {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swaping:");
		System.out.println("A="+a);
		System.out.println("B="+b);
		
		System.out.println("after swaping:");
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("A="+a);
		System.out.println("B="+b);

	}

}
