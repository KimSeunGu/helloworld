package javabook.ch2;

public class HelloWorld4{
	String msg;
	
	public HelloWorld4(){
		msg = "Hello World !!";
	}
	
	public HelloWorld4(String msg){
		this.msg = msg;
	}
	
	public void print(){
		System.out.print(msg);
	}


	public static void main(String[] args){
		HelloWorld4 hello1 = new HelloWorld4();
		hello1.print();
		HelloWorld4 hello2 = new HelloWorld4("My Hello World!!");
		hello2.print();
	}
	
}
