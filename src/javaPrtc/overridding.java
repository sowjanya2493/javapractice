package javaPrtc;


class Animal{  
void eat(){
	System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
void eat(){
	System.out.println("eating bread...");
	}  
void bark(){
	System.out.println("barking...");
	}  
void work(){  
super.eat();  
bark();  
}  
}  
class overridding{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();  
}}  
			


