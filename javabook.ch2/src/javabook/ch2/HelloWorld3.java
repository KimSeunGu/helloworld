package javabook.ch2;

public class HelloWorld3{
	String msg;
	
	public HelloWorld3(){
		msg = "Hello World !!";
	}
	
	public void print(){
		System.out.print(msg);
	}


	public static void main(String[] args){
		HelloWorld3 hello1 = new HelloWorld3();
		hello1.print();
	}
	
}
