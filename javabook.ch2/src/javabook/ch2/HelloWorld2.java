package javabook.ch2;

public class HelloWorld2 {
	
	String msg;

	public HelloWorld2(){
		msg = "Hello World !!";
	}
	
	public void print(){
		System.out.println(msg);
	}
	
	public static void main(String[] args){
		HelloWorld hello1 = new HelloWorld();
		System.out.println("Hello World!!");
	}
	
}
